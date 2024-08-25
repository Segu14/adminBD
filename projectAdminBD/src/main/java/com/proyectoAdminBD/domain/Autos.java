package com.proyectoAdminBD.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;

import lombok.Data;

@Data
@Entity
@Table(name = "autos")
public class Autos implements Serializable{
    
    private static final long serialVersionUID = 1L; 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_auto")
    private Long idAuto;
    private String marca;
    private String modelo;
    private int anho;
    private String color;
    private double precio;
    private double kilometraje;
    private int cilindrada;
    private String tipoGasolina;
    private String tipoTransmision;
    private String estado;
    private int cantidad;
    private int idMantenimiento;
    private int idProveedor;
    
}
