package com.smoothiemx;

public class Main {

    public static void main(String[] args) {

        //  Tipos Primitivos enteros: byte, short, int long

        byte numeroByte = (byte)129;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor mínimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo byte: " + Byte.MAX_VALUE);

        short numeroShort = (short)32768;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor mínimo short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo short: " + Short.MAX_VALUE);

        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Número mínimo int: " + Integer.MIN_VALUE);
        System.out.println("Número máximo int: " + Integer.MAX_VALUE);

        long numeroLong = (long) 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Número mínimo long: " + Long.MIN_VALUE);
        System.out.println("Número máximo long: " + Long.MAX_VALUE);
    }
}