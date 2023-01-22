package com.curso_java;

public class Basicos {
    public static void main(String[] args) {
         // Variables
        // byte edad = 27;

        // // System.out.println(edad);

        // int a = 5;

        // int b;
        // b=7;
        // int c = b + a;
        
        // // STRINGS
        // String name = "Ronaldo Nazario Favelas Mil";
        
        // // System.out.println(name.charAt(3)); // El metodo charAt() devuelve el caracter de la posicion que le hemos indicado.

        // String frase = "Hoy es un dia muy bueno para aprender Java";
        // String resumen = frase.substring(5,18); // Metodo substring recibe el parametro 1 para empezar a extraer y el parametro 2 para detenerse. Crea nueva str con el contenido extraido
        
        // System.out.println(resumen);


        String alumno1, alumno2;

        alumno1="David";
        alumno2="david";

        System.out.println(alumno1.equals(alumno2));
        System.out.println(alumno1.equalsIgnoreCase(alumno2));

    }
}
