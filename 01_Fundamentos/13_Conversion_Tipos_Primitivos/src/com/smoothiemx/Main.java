package com.smoothiemx;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //  Convertir tipo String a un tipo int
        var edad = Integer.parseInt("30");
        // var edad = "30";
        System.out.println("edad = " + (edad + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        // Pedir un valor
        Scanner consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad:");
        edad = Integer.parseInt(consola.nextLine());

        System.out.println("edad = " + edad);

        // Convertir de tipo int a tipo String
        var edadTexto = String.valueOf(10);

        System.out.println("edadTexto = " + edadTexto);

        var caracter = "Hola".charAt(2);
        System.out.println("caracter = " + caracter);

        System.out.println("Proporcione un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}