package com.saguado.pruebas;

import java.util.Date;

public class ClaseString {

    public static void main(String[] args) {

        // Concatenacion en String
        String nombre = "Juan"+" Alvarez";
        String nombre2 = "Juan".concat(" Alvarez");
        String parrafo  = "Esto es un parrafo donde con\n" +
                " y el simbolo + podemos hace un parrafo\n" +
                "y escribir en varias lineas dando salto de linea \n";

        // Construyendo un String atraves de una cadena de caracteres, iun String es un array de caracteres
        char[] cadenaCaracteres = {'C','o','ñ','a','z','o'};
        String caracteresAString = new String(cadenaCaracteres);

        //charAt(int index) -> cogemos/accedemos al caracter en el indice x dentro de un String
        String jugador = "Cristiano Ronaldo";
        char caracter = jugador.charAt(3);
        for (char c: jugador.toCharArray()) {  // convertimos el String a un array de caracteres
            System.out.print(c+" - ");
        }
        System.out.println();
        for (int i =0;i<jugador.length();i++){
            System.out.println(jugador.charAt(i));
        }

        //Convertir a String un numero o cualquier objeto con valueOf(). Esto invoca al metod toString(), solo que si el objeto
        //esta vacio,  devuelve null , no como en toString() que lanza una excepcion de NullPointException.
        String numeroEntero = String.valueOf(2345);
        String numeroDecimales  = String.valueOf(1234.34);

//        Date date = new Date();
        Date date = null;
        String fechaValueOf = String.valueOf(date);  // esto devuelve null
//        String fechatoString = date.toString();   // da error

//        System.out.println(fechatoString);
        System.out.println(fechaValueOf);

        String valueOfInternamente = ""+date;  // el simbolo + invoca internamente a valueOf, viene bien para evitar la excepcion por si el
                                                // contenido de la variable esta vacio

        System.out.println(valueOfInternamente);

        //Comparacion de Strings con equals y equalsIgnoreCase --------------------------------------------------------------------
        String comparador1 = "FOO";
        String comparador2 = "foo";

        Boolean sonIguales = comparador1.equals(comparador2);  // no son iguales porque reconoce  mayusculas y minusculas
       sonIguales = comparador1.equalsIgnoreCase(comparador2); // son iguales pporque ignora las mayusculas

        System.out.println(sonIguales);

        // Busquedas:  ----------------------------------------------------------------------------------------------------------
        // Comprobar si una String largo empieza po termina por algo. startsWith() y endsWith()
        String frase = "http://www.cice.com";
        if (frase.startsWith("http://")){
            System.out.println(frase+" es una URL");
        }

        String email = "profesor@cice.com";
        if (email.endsWith("@cice.com")){
            System.out.println(email+" es un mail coorporativo");
        }

        //Buscar el indice de un caracer dentro de una cadena
        String abecedario = "abcdefghijklmnopqrstuvwxyz";
        int i = abecedario.indexOf('i');
        int b = abecedario.indexOf("bcd");  // devuelve el lugar del primer caracter del string que busques
        int c = abecedario.lastIndexOf("bcd");  // lo mismo de arriba pero buscando de atras hacia delante
        int noesta = abecedario.indexOf("Fer");
        System.out.println(i);
        System.out.println(b);
        System.out.println(c);
        System.out.println(noesta); // devuelve -1 si no encuentra nada

        //Buscar una palabra en un texto
        String texto = "En un lugar de la Mancha de cuyo nombre no logro acordarme";
        if(texto.contains("Manchas")) System.out.println("Es el quijote");
        else System.out.println("No es el quijote");

        // Editando texo ---------------------------------------------------------------------------------



    }
}
