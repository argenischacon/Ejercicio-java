
package com.argenischacon.ejercicio;

import java.util.Date;


public class Bicicleta extends Vehiculo{
    
    private boolean tieneFrenos;
    public Bicicleta(String marca, String modelo, Date year, boolean tieneFrenos){
       super(marca, modelo, year);
       this.tieneFrenos = tieneFrenos;
    }

    @Override
    public void entregarPedido(Terreno terreno) {
        switch (terreno) {
            case CAMPO:
                System.out.println("La bicicleta entrega el pedido en el Campo");
                break;
            case MOUNTAIN:
                System.out.println("La bicicleta entrega el pedido en la Montaña");
                break;
            case CIUDAD:
                System.out.println("La bicicleta entrega el pedido en la Ciudad");
                break;

        }
    }

    public boolean tieneFrenos() {
        return tieneFrenos;
    }
    
   
    
}
