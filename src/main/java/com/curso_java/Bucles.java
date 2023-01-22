package com.curso_java;
// import javax.swing.*;
// import java.util.*;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Bucles {
     // CONTRASEÑA
    // public static void main(String[] args) {
    //     String clave = "Enol";

    //     String pass="";

    //     while (clave.equals(pass) == false ){
    //         pass= JOptionPane.showInputDialog("Introduce la contraseña, por favor");
    //         if(clave.equals(pass) == false){
    //             System.out.println("Contraseña incorrecta");
    //         }
    //     }
    //     System.out.println("Contraseña correcta, acceso permitido");
    // }

    public static void main(String[] args){
        int num = (int)(Math.floor(Math.random()*(1-100+1)+100));
        int numUsuario = 0;
        int intentos = 0;
        Scanner entrada = new Scanner(System.in);
        while(numUsuario != num){
            intentos++;
            System.out.println("Introduce un numero");
            numUsuario = entrada.nextInt();
            if(numUsuario > num){
                System.out.println("El numero introducido es mayor al numero que tiene que adivinar");
            }else{
                System.out.println("El numero introducido es menor al numero que tiene que adivinar");
            }
        }
        System.out.println("Enhorabuena, has acertado el numero, necesitastes " + intentos + " intentos para acertar");
}

}