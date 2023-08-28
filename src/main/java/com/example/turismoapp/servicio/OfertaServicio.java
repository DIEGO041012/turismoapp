package com.example.turismoapp.servicio;

import com.example.turismoapp.modelos.Empresa;
import com.example.turismoapp.modelos.Oferta;
import com.example.turismoapp.repositorio.EmpresaRepositorio;
import com.example.turismoapp.repositorio.OfertaRepositorio;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
@Table(name = "Oferta")

public class OfertaServicio {
    @Autowired
    OfertaRepositorio ofertaRepositorio;

    public Oferta registrarOferta(Oferta datosARegistrar) throws Exception {
        return null;
    }
    public Oferta modificarOferta(Integer id, Oferta datosAModificar)throws Exception{
        return null;
    }
    public Oferta buscarOfertaPorId(Integer id) throws Exception{
        return null;
    }
    public List<Oferta> buscarTodasOferta() throws Exception{
        return null;
    }
    public Boolean eliminarOferta(Integer id) throws Exception{
        return true;
    }
}
