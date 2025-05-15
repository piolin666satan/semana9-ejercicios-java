package com.example;

import java.util.Scanner;

public class MonitoreoTemperatura {

    static Scanner scanner = new Scanner(System.in);
    static double[] temperaturas = new double[12];
    static boolean datosRegistrados = false;

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarTemperaturas();
                    break;
                case 2:
                    analizarTemperaturas();
                    break;
                case 3:
                    System.out.println("Programa finalizado, ¡Hasta pronto!!!");
                    break;
                default:
                    System.out.println("Opción inválida, Intenta otra vez");
                    break;
            }
        } while (opcion != 3);
    }

    public static void mostrarMenu() {
        System.out.println("\n=== MENÚ MONITOREO DE TEMPERATURA ===");
        System.out.println("1. Registrar temperaturas cada hora");
        System.out.println("2. Analizar temperaturas");
        System.out.println("3. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void registrarTemperaturas() {
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Ingrese la temperatura de la hora " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }
        datosRegistrados = true;
        System.out.println("Temperaturas registradas correctamente.");
    }

    public static void analizarTemperaturas() {
        if (!datosRegistrados) {
            System.out.println("Primero debes registrar las temperaturas.");
            return;
        }

        int sobre35 = 0;
        int bajo20 = 0;

        for (double temp : temperaturas) {
            if (temp > 35) {
                sobre35++;
            } else if (temp < 20) {
                bajo20++;
            }
        }

        System.out.println("\nResultados del análisis:");
        System.out.println("Temperaturas mayores a 35°C: " + sobre35);
        System.out.println("Temperaturas menores a 20°C: " + bajo20);
    }
}
