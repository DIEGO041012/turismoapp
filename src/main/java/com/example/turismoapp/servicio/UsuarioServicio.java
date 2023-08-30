package com.example.turismoapp.servicio;

import com.example.turismoapp.repositorio.UsuarioRepositorio;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "Usuario")

public class UsuarioServicio {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;
}
