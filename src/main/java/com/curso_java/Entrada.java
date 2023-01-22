package com.curso_java;

// import java.util.Scanner;

import javax.swing.JOptionPane;

public class Entrada {
    public static void main(String[] args) {
        // Scanner entrada = new Scanner(System.in);

        // System.out.println("Introduce tu nombre, por favor");

        // String nombre_usuario = entrada.nextLine();

        // System.out.println("Introduce edad, por favor");

        // int edad = entrada.nextInt();

        // System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad+1) + " años.");
        
        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre porfavor");
        String edad = JOptionPane.showInputDialog("introduce tu edad, por favor");
        int edad_usuario = Integer.parseInt(edad);

        System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad_usuario+1) + " años.");

    }
}
