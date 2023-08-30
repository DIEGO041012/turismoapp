package com.example.turismoapp.controlador;

import com.example.turismoapp.modelos.Empresa;
import com.example.turismoapp.servicio.EmpresaServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empresa")
public class EmpresaControlador {

    EmpresaServicio empresaServicio;
    @PostMapping
    public ResponseEntity<?> registrarEmpresa(@RequestBody Empresa datosEmpresa){
        return null;
    }
    @PutMapping
    public ResponseEntity<?> editarEmpresa(@RequestBody Empresa datosNuevosEmpresa,@PathVariable Integer idEmpresa){
        return null;
    }
    @GetMapping
    public ResponseEntity<?> buscarUnaEmpresa(@PathVariable Integer id){
        return null;
    }
    public ResponseEntity<?> buscarTodasEmpresas(){
        return null;
    }
    public ResponseEntity<?> borrarEmpresa(@PathVariable Integer id){
        return null;
    }
}
