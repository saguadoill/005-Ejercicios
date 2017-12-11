package com.saguado.pruebas;

/**
 * Prueb de todos los tipos de datos primitivos que hay en java
 */
public class DatosPrimitivos {
    public static void main(String[] args) {

        // int
        int i = 234;
        System.out.println(i);

        i = 0234;   // numero octal , se diferencia en  que iria un 0 delante, equivale a 156
        System.out.println(i);

        i= 0xFFFF;  // numero hexadecimal, tambien se puede asignar a un int, siempre que el rango lo permita
        System.out.println(i);

        i = 0b000011;
        System.out.println(i);

        // un int que se asigne a un long por ejemplo, no  necesita ningun casteo, pero al reves si.
        long largo = i;
        i = (int) largo;

        //Long
        largo = 15; // en este caso 15 se converiria a tipo int(almacenamiento en memoria)
        largo = 15L; // este seria considerado tipo long
        largo = 15l; // no se suele usar la l en minusculas porque se confunde con un uno

        //Separadores "_"
        int EJEMPLO_CONSTANTE_NOMBRE_LARGO = 12_23_3;  // a la hora de usar la variable, sera como 12233
        System.out.println(EJEMPLO_CONSTANTE_NOMBRE_LARGO);

        int variabla_larga = 1___2____3;  // por recomendacion es mejoe variableLarga. Se pueden poner todas las __ q kieras
        System.out.println(variabla_larga);

//        largo = 1234_L;  // no se puede usar al principio ni al final, ni antes de L o D
//        largo = _1234;



    }
}
