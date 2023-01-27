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
        if(asientosCuero.equalsIgnoreCase("si")){
            this.asientosCuero = true;
        }
        if(asientosCuero.equalsIgnoreCase("no")){
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

    public void configuraClimatizador(String climatizador){

        if(climatizador.equalsIgnoreCase("si")){
            this.climatizador = true;
        }
        if(climatizador.equalsIgnoreCase("no")){
            this.climatizador = false;
        }
    }

    public String dimeClimatizador(){
            if(climatizador == true){
                return  "El coche incorpora climatizador";
            }
            if(climatizador == false){
                return  "El coche lleva aire acondicionado";
            }
            return null;
    }

    public String precioCoche(){ // GETTER

        int precioFinal = 10000;

        if(asientosCuero == true){
            precioFinal+=2000;
        }
        if(climatizador == true){
            precioFinal+=1500;
        }

        return "El precio final del coche es " + precioFinal + "$.";
    }




}
