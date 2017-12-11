package com.cice.ejercicios;

/**
 * Clase que recorre un array de numeros enteros y para cuando encuentra un negativo, indicando tambien
 * la cantidad de numeros positivos que ha pasado.
 */
public class Ejercicio06 {
    public static void main(String[] args) {

        int[] numeros = {2,5,7,8,-3,6,7,-1};

        int totalNumeros =0;
        int indice =0;

        boolean esPositivo = true;

        while (esPositivo){

            if(numeros[indice]<0){

                esPositivo=false;
            }else{
                totalNumeros++;
                indice++;
            }

        }

        System.out.println("Total numeros encontrados antes del negativo : "+totalNumeros);
    }
}
