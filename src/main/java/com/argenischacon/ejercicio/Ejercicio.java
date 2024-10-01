package com.argenischacon.ejercicio;

/*Desarrolla un sistema de gestión de vehículos. El sistema debe permitir manejar diferentes 
tipos de vehículos (como coches y motos), con atributos básicos compartidos y métodos para 
mostrar la información específica de cada tipo. Debes usar clases abstractas y genéricos para 
implementar esta funcionalidad.
 */
import java.util.Date;

public class Ejercicio {

    public static void main(String[] args) {

        Garaje<Coche> garajeCoches = new Garaje<>();
        garajeCoches.agregarVehiculo(new Coche("Toyota", "Corolla", 2020, "Gasolina"));
        garajeCoches.agregarVehiculo(new Coche("Tesla", "Model 3", 2022, "Eléctrico"));

        Garaje<Moto> garajeMotos = new Garaje<>();
        garajeMotos.agregarVehiculo(new Moto("Yamaha", "MT-07", 2021, 689));
        garajeMotos.agregarVehiculo(new Moto("Honda", "CB500F", 2019, 471));

        System.out.println("Garaje de Coches:");
        garajeCoches.mostrarVehiculos();

        System.out.println("\nGaraje de Motos:");
        garajeMotos.mostrarVehiculos();

    }
}
