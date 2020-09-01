package com.smoothiemx;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombre;
        int id;
        double precio;
        boolean envioGratis;

        System.out.println("Proporciona el nombre:");
        nombre = scanner.nextLine();

        System.out.println("Proporciona el id:");
        id = Integer.parseInt(scanner.nextLine());

        System.out.println("Proporciona el precio:");
        precio = Double.parseDouble(scanner.nextLine());

        System.out.println("Proporciona el envío gratuito");
        envioGratis = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("\n".concat(nombre.concat(" #").concat(String.valueOf(id))));
        System.out.println("Precio:".concat(" $").concat(String.valueOf(precio)));
        System.out.println("Envío Gratuito: ".concat(Boolean.toString(envioGratis)));
    }
}