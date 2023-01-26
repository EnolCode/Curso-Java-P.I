package com.curso_java;

public class Coche {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    private int altura;
    private int ancho;
    private int motor;
    private String color;
    private boolean asientosCuero, climatizador;

    public Coche(){
        altura=1000;
        ancho=300;
        motor=1600;
    }

    public String dimeColor(){
        return "El color de tu coche es " + this.color;
    }

    public void estableceColor(String colour){
        this.color = colour;
    }

    public void configuraAsientos( String asientosCuero){
        if(asientosCuero=="si"){
            this.asientosCuero = true;
        }
        if(asientosCuero=="no"){
            this.asientosCuero = false;
        }
    }

    public String dimeAsientos(){
        if(asientosCuero==true){
            return "El coche tiene asientos de cuero";
        }
        if(asientosCuero==false){
            return "El coche no tiene asientos de cuero";
        }

        return null;
    }

}
