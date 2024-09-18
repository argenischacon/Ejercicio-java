package com.argenischacon.ejercicio;

import java.util.Scanner;

public class Persona {

    Scanner input = new Scanner(System.in);
    private String nombre;
    private int edad;

    public Persona() {
     
    }

    public void pedirDatos() {
        System.out.println("Digite el nombre: ");
        this.nombre = input.nextLine();
        System.out.println("Digite la edad: ");
        this.edad = input.nextInt();
    }

    @Override
    public String toString() {
        String isOfAge = (edad >= 18)
                ? nombre + " es mayor de edad ya que tiene " + edad + " años de edad"
                : nombre + " es menor de edad ya que tiene " + edad + " años de edad";
        return isOfAge;
    }

}
