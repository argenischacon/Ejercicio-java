package com.argenischacon.ejercicio;

import java.time.LocalDate;

public class Ejercicio {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // Libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);
        Libro libro3 = new Libro("La casa de los espíritus", "Isabel Allende", 1982);
        Libro libro4 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márquez", 1985);
        Libro libro5 = new Libro("Ficciones", "Jorge Luis Borges", 1944);

       //Añadir libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);

        // Usuarios
        Usuario usuario1 = new Usuario("Ana Pérez", 101);
        Usuario usuario2 = new Usuario("Carlos Mendoza", 102);
        Usuario usuario3 = new Usuario("María Fernández", 103);
        Usuario usuario4 = new Usuario("Jorge Ramírez", 104);
        Usuario usuario5 = new Usuario("Luis Rodríguez", 105);

        //Registrar usuario en la biblioteca
        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);
        biblioteca.registrarUsuario(usuario3);
        biblioteca.registrarUsuario(usuario4);
        biblioteca.registrarUsuario(usuario5);

        //Mostrar libros disponibles
        System.out.println("\nLibros Disponibles");
        biblioteca.mostrarLibrosDisponibles();
        
        //Tomar prestado un libro
        System.out.println("\nAna Perez toma prestado 'Cien años de Soledad'");
        usuario1.tomarPrestado(libro1);

        System.out.println("'Cien años de Soledad' esta prestado en el catalogo de la biblioteca?: "+biblioteca.getCatalogo().get(0).isPrestado());
        
        /*
        //Mostrar libros disponibles despues del prestamo
        System.out.println("\nLibros disponibles despues del prestamo");
        biblioteca.mostrarLibrosDisponibles();
        
        //Mostrar libros prestados por Ana
        System.out.println("\nLibros prestados a Ana");
        usuario1.mostrarLibrosPrestados();
        
        ////Tomar prestado un libro
        System.out.println("\nCarlos intenta tomar prestado 'Cien años de Soledad'");
        usuario2.tomarPrestado(libro1);
        
        //Devolver Libro
        System.out.println("\nAna Perez devuelve 'Cien años de Soledad'");
        usuario1.devolverLibro(libro1);
        
        //Mostrar libros disponibles despues de la devolucion
        System.out.println("\nLibros disponibles despues de la devolucion");
        biblioteca.mostrarLibrosDisponibles();

        */
        
        
    }
}
