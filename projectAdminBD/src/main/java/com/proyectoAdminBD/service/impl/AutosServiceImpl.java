package com.proyectoAdminBD.service.impl;

import com.proyectoAdminBD.dao.AutosDao;
import com.proyectoAdminBD.domain.Autos;
import com.proyectoAdminBD.service.AutosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AutosServiceImpl implements AutosService {

    @Autowired
    private AutosDao autosDao;
    
    @Transactional(readOnly = true)
    public List<Autos> getAutos() {
        var lista = autosDao.findAll();
        
        return lista;
    }
    
    @Override
    @Transactional(readOnly = true)
    public Autos getAuto(Autos autos) {
        return autosDao.findById(autos.getIdAuto()).orElse(null);
    }

    @Override
    public void save(Autos autos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Autos autos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

 
    
}
