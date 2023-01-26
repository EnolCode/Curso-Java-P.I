package com.curso_java;

public class UsoCoche {
    public static void main(String[] args) {
        Coche micoche = new Coche();
        micoche.estableceColor("rosa");
        System.out.println(micoche.dimeColor());
    }
}
