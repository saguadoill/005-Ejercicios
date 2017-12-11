package com.saguado.pruebas;

import java.util.Scanner;

public class PruebasContinueBreak {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;

        while (num1 == 0){
            System.out.println("Introducir numero 1: ");
            num1 = entrada.nextInt();
            System.out.println("Entramos primer While");
//          break;   --> Al poner break el IDE marcaerror ya que saldria automaticamente del bucle y el segundo bucle nunca se
                        // iniciaria.
//          continue;  --> puesto aqui CONTINUA pero con el bucle 1, no entraria tampoco en el segundo

            while (num2 ==0){
                System.out.println("Introducir numero 2: ");
                num2 = entrada.nextInt();
                System.out.println("Entramos segundo While");

//              break; // --> Saldria completamente de este bucle, volviendo al bucle 1
//              continue;  // --> Continuaria con el bucle 2, como si no pasara nada vamos. Aki daria igual ponerlo o no
            }

        }
        System.out.println("Salida de todo");

    }
}
