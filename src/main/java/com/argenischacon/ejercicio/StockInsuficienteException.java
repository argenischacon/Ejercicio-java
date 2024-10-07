
package com.argenischacon.ejercicio;


public class StockInsuficienteException extends Exception{

    public StockInsuficienteException() {
        super("Stock insuficiente para este producto");
    }
    
    public StockInsuficienteException(String message) {
        super(message);
    }
    
    
}
