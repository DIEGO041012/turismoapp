package com.example.turismoapp.controlador;

import com.example.turismoapp.modelos.Empresa;
import com.example.turismoapp.modelos.Oferta;
import com.example.turismoapp.servicio.EmpresaServicio;
import com.example.turismoapp.servicio.OfertaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/oferta")
public class OfretaControlador {
    @Autowired
    OfertaServicio ofertaServicio;
    @PostMapping
    public ResponseEntity<?> registrarOferta(@RequestBody Oferta datosOferta){
        return null;
    }
    @PutMapping
    public ResponseEntity<?> editarOferta(@RequestBody Oferta datosNuevosOferta,@PathVariable Integer idOferta){
        return null;
    }
    @GetMapping
    public ResponseEntity<?> buscarUnaOferta(@PathVariable Integer id){
        return null;
    }
    public ResponseEntity<?> buscarTodasOferta(){
        return null;
    }
    public ResponseEntity<?> borrarOferta(@PathVariable Integer id){
        return null;
    }
}

