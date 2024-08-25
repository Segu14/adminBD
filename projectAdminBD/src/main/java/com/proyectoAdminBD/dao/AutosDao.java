package com.proyectoAdminBD.dao;

import com.proyectoAdminBD.domain.Autos;
import org.springframework.data.jpa.repository.JpaRepository; 

public interface AutosDao 
        extends JpaRepository<Autos, Long> {
}
