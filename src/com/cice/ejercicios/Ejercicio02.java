package com.cice.ejercicios;

import java.util.Scanner;

/**
 * Clase que comprueba si un numero dado por el usuario es PAR o IMPAR
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        int numero =0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("EJERCICIO 2- Fundamentos");
        System.out.println("========================");

        System.out.print("Introducir un numero para decir si es par o impar... ");
        numero = entrada.nextInt();

        if(numero%2==0){
            System.out.println("El numero "+numero+" es PAR");
        }else{
            System.out.println("El numero "+numero+" es IMPAR");
        }

    }
}
