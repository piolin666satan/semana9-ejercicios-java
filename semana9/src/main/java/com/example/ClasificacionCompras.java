package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class ClasificacionCompras {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Double> compras = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarCompras();
                    break;
                case 2:
                    clasificarCompras();
                    break;
                case 3:
                    System.out.println("Programa finalizado, ¡Hasta pronto!!!");
                    break;
                default:
                    System.out.println("Opción inválida, Inténtalo de nuevo");
                    break;
            }
        } while (opcion != 3);
    }

    public static void mostrarMenu() {
        System.out.println("\n=== MENÚ DE CLASIFICACIÓN DE COMPRAS ===");
        System.out.println("1. Registrar montos de compras de clientes");
        System.out.println("2. Clasificar y mostrar resultados");
        System.out.println("3. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void registrarCompras() {
        compras.clear(); // Reinicia los datos si se vuelve a registrar

        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese el monto de la compra del cliente #" + (i + 1) + ": ");
            double monto = scanner.nextDouble();
            compras.add(monto);
        }
        System.out.println("Compras registradas correctamente.");
    }

    public static void clasificarCompras() {
        int pequeños = 0, medianos = 0, grandes = 0;

        for (double compra : compras) {
            if (compra < 50000) {
                pequeños++;
            } else if (compra <= 100000) {
                medianos++;
            } else {
                grandes++;
            }
        }

        System.out.println("\nClasificación de compras:");
        System.out.println("Compras pequeñas (<50.000): " + pequeños);
        System.out.println("Compras medianas (50.000 - 100.000): " + medianos);
        System.out.println("Compras grandes (>100.000): " + grandes);
    }
}
