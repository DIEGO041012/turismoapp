package com.example.turismoapp.Utiles;

import com.example.turismoapp.modelos.Oferta;

public class OfertaValidacion {

    public OfertaValidacion(){

    }
    public boolean validarTitulo(String titulo)throws Exception{
        if(titulo.length()>20){
           return false;
        }
        else
        {
            return true;
        }
    }
}
