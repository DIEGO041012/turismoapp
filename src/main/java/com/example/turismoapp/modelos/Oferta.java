package com.example.turismoapp.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="oferta")


public class Oferta
{
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="idoferta",nullable = false)

    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double costoPersona;
}

