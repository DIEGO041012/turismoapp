package com.example.turismoapp.Utiles;

import org.springframework.stereotype.Component;

@Component
public class EmpresaValidacion {

    public EmpresaValidacion() {
    }

    public Boolean validarNombre(String nombre) throws Exception
    {

        if(nombre.length()>30){
            throw new Exception("longitud de caracteres invalido");
        }else {
            return true;
        }
        }
}
