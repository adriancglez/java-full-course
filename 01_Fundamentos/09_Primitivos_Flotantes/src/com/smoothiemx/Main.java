package com.smoothiemx;

public class Main {

    public static void main(String[] args) {

        //  Tipos primitivos de tipo flotante: float y double

        float numeroFloat = (float) 3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Número mínimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Número máximo tipo float: " + Float.MAX_VALUE);

        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor mínimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo tipo double: " + Double.MAX_VALUE);
    }
}