package com.cice.ejercicios;

import java.util.Scanner;

/**
 * Clase que calcula el factorial de un numero dado por el usuario.
 *
 */
public class Ejercicio04 {

    /**
     * Metodo principar que inicia la aplicacion
     * @param args No recibe ningun argumento.
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        long numero =0;

        System.out.println("EJERCICIO 04 - Fundamentos");
        System.out.println("==========================");

        while(continuar){

            System.out.print("Introiduce un numero para calcular el factorial( 0 to EXIT ): ");
            numero=entrada.nextInt();

            if (numero == 0){

                continuar = false;
            }else {

                for (long i=numero-1; i>0;i--){
                    numero *= i;
                }
                System.out.println(numero);
                System.out.println();
                System.out.println("========================================");
                System.out.println();
            }
        }
        System.out.println("Gracias por utilizar nuestra calculadora factorial!");

    }
}
