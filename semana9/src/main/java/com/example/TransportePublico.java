package com.example;

import java.util.Scanner;

public class TransportePublico {
    static Scanner scanner = new Scanner(System.in);
    static double[] horarios = {7.00, 9.30, 12.00, 14.30, 17.00, 19.30};

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    buscarProximoBus();
                    break;
                case 2:
                    System.out.println("Cerrando programa, Hasta luego");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta otra vez");
                    break;
            }
        } while (opcion != 2);
    }

    public static void mostrarMenu() {
        System.out.println("\n===MENÚ DE TRANSPORTE PÚBLICO ===");
        System.out.println("1. Buscar próximo bus disponible");
        System.out.println("2. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void buscarProximoBus() {
        System.out.print("Ingresa la hora actual (formato 24h, ej. 15.30): ");
        double horaActual = scanner.nextDouble();

        boolean encontrado = false;
        for (double horario : horarios) {
            if (horario > horaActual) {
                System.out.println("El próximo bus sale a las " + horario + " horas.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No hay más buses disponibles hoy.");
        }
    }
}

