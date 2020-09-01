package com.smoothiemx;

public class Main {

    public static void main(String[] args) {

        boolean varBoolean = true;  // false;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es false");
        }

        var edad = 10;
        //var esAdulto = edad >= 18;

        /*if (esAdulto) {*/
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
