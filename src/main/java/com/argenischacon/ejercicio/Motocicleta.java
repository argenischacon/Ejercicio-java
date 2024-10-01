package com.argenischacon.ejercicio;

import java.util.Date;

public class Motocicleta extends Vehiculo {

    public Motocicleta(String marca, String modelo, Date year) {
        super(marca, modelo, year);
    }

    @Override
    public void entregarPedido(Terreno terreno) {
        switch (terreno) {
            case CAMPO:
                System.out.println("La motocicleta entrega el pedido en el Campo");
                break;
            case MOUNTAIN:
                System.out.println("La motocicleta entrega el pedido en la Montaña");
                break;
            case CIUDAD:
                System.out.println("La motocicleta entrega el pedido en la Ciudad");
                break;

        }
    }
}
