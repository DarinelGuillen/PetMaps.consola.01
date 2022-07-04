package com.petmaps.consola.models.objetos;

public class Usuario {


    private int IdUser;
    private String NombreDeUsuario;
    private byte Edad;
    private String Mail;
    private String Contraseña;
    //Atributos ETC... Para ser apto para adoptar
    //Numero de contacto, Ine, etc...


    public Usuario(int idUser, String nombreDeUsuario, byte edad, String mail, String contraseña) {
        IdUser = idUser;
        NombreDeUsuario = nombreDeUsuario;
        Edad = edad;
        Mail = mail;
        Contraseña = contraseña;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int idUser) {
        IdUser = idUser;
    }

    public String getNombreDeUsuario() {
        return NombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        NombreDeUsuario = nombreDeUsuario;
    }

    public byte getEdad() {
        return Edad;
    }

    public void setEdad(byte edad) {
        Edad = edad;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "\nUsuario " +
                "IdUser=" + IdUser +
                "\nNombreDeUsuario=" + NombreDeUsuario +
                "\nEdad=" + Edad +
                "\nMail='" + Mail +
                "\nContraseña=" + Contraseña;
    }
}
