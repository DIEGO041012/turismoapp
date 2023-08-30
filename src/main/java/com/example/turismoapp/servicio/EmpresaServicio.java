package com.example.turismoapp.servicio;

import com.example.turismoapp.Utiles.EmpresaValidacion;
import com.example.turismoapp.modelos.Empresa;
import com.example.turismoapp.repositorio.EmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service


public class EmpresaServicio {

    @Autowired
    EmpresaRepositorio empresaRepositorio;
    @Autowired
    EmpresaValidacion empresaValidacion;

    public Empresa registrarEmpresa(Empresa datosARegistrar) throws Exception {
        try {
            if (!this.empresaValidacion.validarNombre(datosARegistrar.getNombre())) {
                throw new Exception("error en el dato entregado");
            }
            //si pso todos los if estoy listo para llamar al repositorio
            return (this.empresaRepositorio.save(datosARegistrar));
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }

    public Empresa modificarEmpresa(Integer id, Empresa datosAModificar) throws Exception {

        try {
            if(!this.empresaValidacion.validarNombre(datosAModificar.getNombre()))
            {
                throw new Exception("error en el dato entregado");
            }
            Optional<Empresa>empresaEncontrada=empresaRepositorio.findById(id);
            if (empresaEncontrada.isEmpty())
            {
                throw new Exception("empresa no encontrada");
            }
            Empresa empresaQueExiste=empresaEncontrada.get();
            empresaQueExiste.setNombre(datosAModificar.getNombre());
            return (this.empresaRepositorio.save(empresaQueExiste));

        }
        catch (Exception error){
            throw new Exception(error.getMessage());

        }
    }
        //buscar que la empresa que tiene el id que envia el usuario en bd


        public Empresa buscarEmpresaPorId(Integer id) throws Exception{
        try {
            Optional<Empresa> empresaOptional=this.empresaRepositorio.findById(id);
            if (empresaOptional.isEmpty()){
                throw new Exception("empresa no encontrada");
            }
            return empresaOptional.get();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
        }
        public List<Empresa> buscarTodasEmpresas() throws Exception{
        try {
            List<Empresa>listEmpresa=this.empresaRepositorio.findAll();
            return listEmpresa;

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
        }
        public Boolean eliminarEmpresa(Integer id) throws Exception{
        try {
            Optional<Empresa> empresaOptional=this.empresaRepositorio.findById(id);

            if (empresaOptional.isPresent()){
                this.empresaRepositorio.deleteById(id);
                return true;
            }else {
                throw new Exception("empresa no encotrada");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
        }
    }
