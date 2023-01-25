package com.curso_java;

public class Arrays {
    public static void main(String[] args) {

    // int [] mi_matriz = new int[5]; // Manera de declarar un array
    // // int mi_matriz2 [] = new int[5]; // Manera de declarar un array tambien valida

    // mi_matriz[0]=35;
    // mi_matriz[1]=56;
    // mi_matriz[2]=57;
    // mi_matriz[3]=54;
    // mi_matriz[4]=52;

    // int [] mi_matriz3={5, 34, 75, 32, 5}; // Otra variables de tipo entero igual que la de arriba, delcaracion implicita 
    // System.out.println(mi_matriz[3]);
    // System.out.println(mi_matriz3[3]);

    // String [] paises = {"España", "Cataluña", "Portugal", "Suecia"};


    // int index = 0;
    // for(String pais:paises){  // BUCLE FOREACH
    //     index++;
    //     System.out.println("Pais: " + index + " " + pais);
    // }

    // ********************** EJEMPLO 

    double acumulado;
    double interes = 0.10;

    double [][] saldo = new double[6][5];

    for(int i=0; i<6 ; i++){
        saldo[i][0]=10000;
        acumulado = 10000;

        for(int j = 1; j<5; j++){
            acumulado = acumulado + (acumulado*interes);
            saldo[i][j] = acumulado;
        }
        interes=interes+0.01;
    }

    for(int z=0; z<6; z++){
        System.out.println();

        for(int h=0;h<5;h++){
            System.out.printf("%1.2f", saldo[z][h]);
            System.out.print(" ");
        }
    }
}
}
