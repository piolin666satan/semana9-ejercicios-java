package com.example;

import java.util.Scanner;

public class CajeroAutomatico {

    static Scanner scanner = new Scanner(System.in);
    static int[] billetes = {100000, 50000, 20000, 10000};

    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    simularRetiro();
                    break;
                case 2:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    break;
            }

        } while (opcion != 2);
    }

    public static void mostrarMenu() {
        System.out.println("\n=== CAJERO AUTOMÁTICO ===");
        System.out.println("1. Retirar dinero");
        System.out.println("2. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void simularRetiro() {
        System.out.print("\nIngresa el monto a retirar (múltiplo de 10.000): ");
        int monto = scanner.nextInt();

        if (monto % 10000 != 0 || monto <= 0) {
            System.out.println(" Monto inválido. Debe ser un múltiplo de 10.000.");
            return;
        }

        System.out.println(" Desglose de billetes:");
        for (int i = 0; i < billetes.length; i++) {
            int cantidad = monto / billetes[i]; // cuántos billetes de ese tipo
            if (cantidad > 0) {
                System.out.println("- " + cantidad + " billete(s) de $" + billetes[i]);
                monto %= billetes[i]; // resto del monto
            }
        }
    }
}
