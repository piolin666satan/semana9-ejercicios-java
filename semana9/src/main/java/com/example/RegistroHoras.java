package com.example;

import java.util.Scanner;

public class RegistroHoras {
static    Scanner scanner = new Scanner(System.in);
static    double[][] horas = new double[3][5];
    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    registrarHoras();
                    break;
                case 2:
                mostrarTotales();
                    break;
                case 3:
                System.out.println("hasta pronto!!!");

                default:
                System.out.println("error en el programa");
                    break;
            }
        } while (opcion != 3);
    }
    public static void mostrarMenu() {
        System.out.println("\n=== MENÚ DE OPCIONES ===");
        System.out.println("1. Registrar horas trabajadas");
        System.out.println("2. Mostrar total de horas por trabajador");
        System.out.println("3. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void registrarHoras() {
        for (int i = 0; i < 3; i++) {
            System.out.println("\ningrese las horas del trabajador # " + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.println(" dia " + (j + 1) + " horas trabajadas ");
                horas[i][j] = scanner.nextDouble();
            }
            scanner.nextLine();
        }
        System.out.println("Horas registradas correctamente");
    }
    public static void mostrarTotales() {
        for (int i = 0; i < 3; i++) {
            double total = 0;
            for (int j = 0; j < 5; j++) {
                total += horas[i][j];
            }
            System.out.println(" trabajador # " + (i + 1) +  " hizo un total de : " +  total + " horas trabajadas ");
        }
    }
}
