package com.example;

import java.util.Scanner;

public class RevisionVentas {
    static Scanner scanner = new Scanner(System.in);
    static double[] ventas = new double[7];
    static boolean ventasRegistradas = false;

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    registrarVentas();
                    break;
                case 2:
                    if (ventasRegistradas) {
                        mostrarMayorYMenor();
                    } else {
                        System.out.println(" Primero debes registrar las ventas.");
                    }
                    break;
                case 3:
                    System.out.println(" Programa finalizado.");
                    break;
                default:
                    System.out.println(" Opción inválida.");
                    break;
            }

        } while (opcion != 3);
    }

    public static void mostrarMenu() {
        System.out.println("\n=== MENÚ DE VENTAS ===");
        System.out.println("1. Registrar ventas semanales");
        System.out.println("2. Mostrar mayor y menor venta");
        System.out.println("3. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void registrarVentas() {
        for (int i = 0; i < 7; i++) {
            System.out.print(" Ingresa la venta del día " + (i + 1) + ": ");
            ventas[i] = scanner.nextDouble();
        }
        ventasRegistradas = true;
        System.out.println(" Ventas registradas correctamente.");
    }

    public static void mostrarMayorYMenor() {
        double mayor = ventas[0];
        double menor = ventas[0];
        int diaMayor = 0;
        int diaMenor = 0;

        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > mayor) {
                mayor = ventas[i];
                diaMayor = i;
            }
            if (ventas[i] < menor) {
                menor = ventas[i];
                diaMenor = i;
            }
        }

        System.out.println("\n Día de mayor venta: Día " + (diaMayor + 1) + " con $" + mayor);
        System.out.println(" Día de menor venta: Día " + (diaMenor + 1) + " con $" + menor);
    }
}
