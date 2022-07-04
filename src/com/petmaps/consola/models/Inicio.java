package com.petmaps.consola.models;

import java.util.Scanner;

public class Inicio {
    MetodoInicio metodoInicio= new MetodoInicio();
    public void Primermenu(){

        if(metodoInicio.NewUserOrUser()==1){
            //1 usuario nuevo


        }else{
            //2 Ya soy usuario
            metodoInicio.MostrarMenuPrincipaGeneral();
        }

    }
}
