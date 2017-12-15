package com.saguado.pruebas;

import java.util.Scanner;

/**
 * Clase que recoge la cantidad de numeros de la Secuencia de Fivonacci que quiera el usuario imprimir
 * por pantalla
 */
public class SerieFivonacci {
    public static void main(String[] args) {

        Scanner entrada  = new Scanner(System.in);
        int cantidad =0;
        int numeroAnterior = 0;
        int numeroActual = 1;
        int numeroSiguiente = 0;

        System.out.println("Secuencia de Fivonacci");
        System.out.println("======================");
        System.out.print("Introduce longitud secuencia en enteros: ");
        cantidad = entrada.nextInt();

        for (int i =0; i<cantidad ;i++){

            System.out.print(numeroActual+"  ");

            numeroSiguiente = numeroAnterior + numeroActual;

            numeroAnterior = numeroActual;

            numeroActual = numeroSiguiente;

        }

    }
}
