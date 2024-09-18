package com.argenischacon.ejercicio;

public class Ejercicio {

    public static void main(String[] args) {
        
        Persona perso = new Persona();//Instaciamos la clase persona
        perso.pedirDatos();//Llamamos al metodo pedirDatos del objeto perso
        System.out.println(perso.toString());//Mostramosel metodo toString (sobreescrito)
    }
}
