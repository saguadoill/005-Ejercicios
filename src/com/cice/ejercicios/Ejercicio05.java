package com.cice.ejercicios;

/**
 * Clase que calcula la suma de todos los valores de un array
 */
public class Ejercicio05 {
    public static void main(String[] args) {

        int[] numeros = {2,4,8,16,32,128,256};
        int suma =0;

        System.out.println("EJERCICIO 05- Fundamentos");
        System.out.println("=========================");

        for (int numero : numeros){
            System.out.print(suma);
            suma += numero;
            System.out.print(" + "+numero+" = "+suma );
            System.out.println();
        }

        System.out.println("La suma de total del array es: "+suma);
    }
}
