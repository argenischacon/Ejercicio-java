
package com.argenischacon.ejercicio;


public class Libro {
   //Atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean prestado;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false;
    }

    public void prestamo(){
        this.prestado = true;
    }
    
    public void devolucion(){
        this.prestado = false;
    }
    
    @Override
    public String toString(){
        return "Libro{Titulo: "+this.titulo+", Autor: "+this.autor+", Publicacion: "+
                this.anioPublicacion+", Prestado: "+this.prestado+" }";
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    
    
    
}
