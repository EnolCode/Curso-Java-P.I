package com.curso_java;

import javax.swing.JOptionPane;

public class UsoCoche {
    public static void main(String[] args) {
        Coche micoche = new Coche();
        micoche.estableceColor("rosa");
        micoche.configuraAsientos(JOptionPane.showInputDialog("¿Quiere asientos de cuero?"));
        micoche.configuraClimatizador(JOptionPane.showInputDialog("¿Quiere climatizador?"));
        System.out.println(micoche.dimeColor());
        System.out.println(micoche.precioCoche());
    }
}
