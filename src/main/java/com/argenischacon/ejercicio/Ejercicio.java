package com.argenischacon.ejercicio;

import javax.swing.JOptionPane;

public class Ejercicio {

    public static void main(String[] args) {
        int numero = 0;
        boolean isValidNumber = false;
        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el numero del factorial: "));
                //Llamar al metodo recursivo para calcular el factorial
                JOptionPane.showMessageDialog(null, "El factorial del numero " + numero + " es: " + factorial(numero));
                isValidNumber = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un numero entero valido");
            }
        } while (!isValidNumber);

    }

    private static int factorial(int numero) {

        if (numero > 0) {

            return numero * factorial(numero - 1);

        } else if (numero == 0) {//condicion de parada

            return 1;
        }

        return numero;
    }

}
