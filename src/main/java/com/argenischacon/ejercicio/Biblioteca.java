
package com.argenischacon.ejercicio;

import java.util.ArrayList;
import java.util.NoSuchElementException;


public class Biblioteca {
    //Atributos
    private ArrayList<Libro> catalogo;
    private ArrayList<Usuario> usuarios;
    
    public Biblioteca(){
        catalogo = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void agregarLibro(Libro libro){
        catalogo.add(libro);
    }
    
    public void registrarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public void mostrarLibrosDisponibles(){
        if(catalogo.isEmpty()){
            throw new NoSuchElementException("No hay libros en el catalogo");
        }
        
        //mostrar los que estan disponibles
        for(Libro l: catalogo){
            if(!l.isPrestado()){
                System.out.println(l.toString());
            }
        }
    }

    public ArrayList<Libro> getCatalogo() {
        return catalogo;
    }

}
