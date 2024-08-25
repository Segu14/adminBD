package com.proyectoAdminBD.service;

import com.proyectoAdminBD.domain.Autos;
import java.util.List;

public interface AutosService {
    
    /* CRUD
    CReate, Read, Upadate Delete
    */
    //Se define la firma del método para recuperar 
    //los registro de la tabla reservacion en una lista
    
    public List<Autos> getAutos();
    
    //Se define la firma del método para recuperar UN registro
    //de la tabla categroria el valor de idReservacion
    public Autos getAuto(Autos autos);
    
    //Se define la firma del método para Crear o Modificar un registro 
    //Si el idReservacion que pasan esta null, se crea el registro
    //Si el idReservacion que para tienen un valor, se modifica ese registro 
    public void save(Autos autos);
    
    //Se define la firma del método para Eliminar un registro
    //Se elimina el regisro que tiene el idReservacion
    public void delete(Autos autos);
    
}
