package com.cice.ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForeach {

    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,6,7,8,9};
        numeros = new int[]{1,2,3,4,5};
 //     numeros = new int[5];

        for (int i =0;i< numeros.length;i++){

            System.out.println(numeros[i]);
        }

        for (int numero : numeros) {  // buenas practicas, singular lo que recuperas del plural

            System.out.println(numero);

        }

//        List<Integer> lista = new ArrayList<>();
//        lista.forEach(num -> System.out.println(numero));   //  expresion Lambda (ya lo veremos)

        int condicion = 3;
        while(numeros[4]> condicion && 1 == 1){    // misma logica que un if

            System.out.println(condicion++);
        }


        do{
            System.out.println(condicion++);
        }while(numeros[4]> condicion && 1 == 1);

    }

}
