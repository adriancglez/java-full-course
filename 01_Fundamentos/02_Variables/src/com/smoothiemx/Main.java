package com.smoothiemx;

public class Main {

    public static void main(String[] args) {

        /*Definimos la variable*/
        int miVariableEntera = 10;
        System.out.println("miVariableEntera = " + miVariableEntera);

        /* Modificamos el valor de la variable*/
        miVariableEntera = 5;
        System.out.println("miVariableEntera = " + miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println("miVariableCadena = " + miVariableCadena);

        miVariableCadena = "Adios";
        System.out.println("miVariableCadena = " + miVariableCadena);

        /*Uso de var*/
        var miVariableEntera2 = 15;
        System.out.println("miVariableEntera2 = " + miVariableEntera2);

        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);

        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        /*var áVariable = 4;    - No se recomienda utilizar*/
        /*var #miVariable = 5;  - No se permite utilizar caracteres especiales*/
    }
}