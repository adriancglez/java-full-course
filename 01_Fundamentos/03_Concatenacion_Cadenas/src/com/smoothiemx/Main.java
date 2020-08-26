package com.smoothiemx;

public class Main {

    public static void main(String[] args) {

        var usuario = "Adrián";
        var titulo = "Ingeniero";

        var union = usuario + " " + titulo;

        System.out.println("union = " + union);

        var i = 3;
        var j = 4;
        System.out.println(i + j);  //Se realiza la suma de números

        System.out.println(i + j + usuario); // Evaluaición de izquierda a derecha, realiza suma

        System.out.println(titulo + i + j + usuario);   // contexto cadena, todo es una cadena

        System.out.println(usuario + (i + j));  // Uso de paréntesis modifican la prioridad
    }
}