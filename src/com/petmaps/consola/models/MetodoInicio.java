package com.petmaps.consola.models;

import java.util.Scanner;

public class MetodoInicio {

    Scanner T = new Scanner(System.in);

    public byte NewUserOrUser(){
        System.out.println("-----Bienvenido a PetMaps-----");
        System.out.println("------------------------------");
        System.out.println("1) soy usuario nuevo");
        System.out.println("2) Ya soy usuario");
        byte How= T.nextByte();
        return How;


    }
    public void MostrarMenuPrincipaGeneral(){

        System.out.println("-----Bienvenido a PetMaps-----");
        System.out.println("------------------------------");
        System.out.println("-Ingrese su nombre de usuario-");
        String Usuario = T.nextLine();
        System.out.println("-------------------------------");
        System.out.println("-----Ingrese su contraseña-----");
        String Contraseña = T.nextLine();
        System.out.println("------------Ingresar-----------");
        System.out.println("-------------------------------");


    }
    public boolean AddNewUser(){

    return true;
    }
}
