package com.example;

import java.util.Scanner;

public class EvaluacionProductos {
    static Scanner scanner = new Scanner(System.in);
    static int[] estado = new int[50];
    static boolean productosEvaluados = false;

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarEstados();
                    break;
                case 2:
                    mostrarResultados();
                    break;
                case 3:
                    System.out.println("Cerrando programa. Hasta luego!!!");
                    break;
                default:
                    System.out.println("Opción inválida, Intenta de nuevo");
                    break;
            }
        } while (opcion != 3);
    }

    public static void mostrarMenu() {
        System.out.println("\n=== MENÚ DE EVALUACIÓN DE PRODUCTOS ===");
        System.out.println("1. Registrar estado de productos");
        System.out.println("2. Mostrar resultados de evaluación");
        System.out.println("3. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void registrarEstados() {
        for (int i = 0; i < estado.length; i++) {
            int entrada;
            do {
                System.out.print("Producto #" + (i + 1) + " (1 = bueno, 0 = defectuoso): ");
                entrada = scanner.nextInt();
            } while (entrada != 0 && entrada != 1);

            estado[i] = entrada;
        }
        productosEvaluados = true;
        System.out.println("Evaluación completada con éxito.");
    }

    public static void mostrarResultados() {
        if (!productosEvaluados) {
            System.out.println("Primero debes registrar los estados de los productos.");
            return;
        }

        int buenos = 0;
        int defectuosos = 0;

        for (int i = 0; i < estado.length; i++) {
            if (estado[i] == 1) {
                buenos++;
            } else {
                defectuosos++;
            }
        }

        double porcentajeDefectuosos = (defectuosos * 100.0) / estado.length;

        System.out.println("\nResultados de Evaluación:");
        System.out.println("Productos buenos: " + buenos);
        System.out.println("Productos defectuosos: " + defectuosos);
        System.out.printf("Porcentaje de defectuosos: %.2f%%\n", porcentajeDefectuosos);
    }
}
