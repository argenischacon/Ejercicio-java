package com.argenischacon.ejercicio;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Usuario {

    //Atributos
    private String nombre;
    private int id;
    private ArrayList<Libro> librosPrestados;

    public Usuario(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        librosPrestados = new ArrayList<>();
    }

    public void tomarPrestado(Libro libro) {
        if (!libro.isPrestado()) {
            libro.prestamo();
            librosPrestados.add(libro);
        } else if(librosPrestados.contains(libro)) {
            System.out.println("El libro ya ha te ha sido prestado");
        }else{
            System.err.println("El libro ya ha sido prestado a otra persona");
        }
    }

    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) {
            libro.devolucion();
            librosPrestados.remove(libro);
        } else {
            System.err.println("El libro no se puede devolver, no lo pediste prestado");
        }
    }

    public void mostrarLibrosPrestados(){
        if(librosPrestados.isEmpty()){
            throw new NoSuchElementException("No hay libros prestados para este usuario");
        }
        
        for (Libro l: librosPrestados){
            System.out.println(l.toString());
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

}
