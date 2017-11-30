package com.cice.ejercicios;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[]args){

        int hora =0;

        Scanner entrada =  new Scanner(System.in);

        System.out.println("EJERCICIO 3 - Fundamentos");
        System.out.println("=========================");

        System.out.print("Introduce la hora: ");

        hora = entrada.nextInt();

        if(hora > 0 & hora < 24){
            if((hora>0 && hora <6) || (hora>=21 && hora <=24) ){
                System.out.println("Buenas noches");
            }else if(hora>=6 && hora <=14){
                System.out.println("Buenos dias");
            }else if(hora>14 && hora < 21){
                System.out.println("Buenas tardes");
            }else {
                System.out.println("Hora Incorrecta!!");
            }
        }

/*        switch (hora){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Buenas noches");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Buenos dias");
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                System.out.println("Buenas tardes");
                break;
            case 21:
            case 22:
            case 23:
            case 24:
                System.out.println("Buenas noches");
                break;
            default :
                System.out.println("No has introducido una hora valida");
                break;
        }
 */

        boolean esCierto = true;
        boolean esFalso = false;

        if (!esCierto){
            System.out.println("Es cierto...");
        }else {
            System.out.println("No es cierto..");
        }
    }

}
