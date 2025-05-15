package com.example;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String[] nombre = new String[5];
    static double[] precio = new double[5];
        public static void main(String[] args) {
            int opcion;

            do {
                mostrarMenu();
                opcion = scanner.nextInt();
                scanner.nextLine();
                switch (opcion) {
                    case 1:
                        RegistrarProducto();
                        break;
                    case 2:
                    mostrarProductosCaros();
                        break;

                    case 3:
                    System.out.println("saliendo del programa...");
                        break;
                    default:
                    System.out.println("fallo en el programa. intentelo de nuevo");
                        break;
                }
            } while (opcion != 3);
        }



    public static void mostrarMenu() {
        System.out.println("\n=== MENÚ DE OPCIONES ===");
        System.out.println("1. Registrar productos");
        System.out.println("2. Mostrar productos mayores a $50.000");
        System.out.println("3. Salir");
        System.out.print("Selecciona una opción: ");
    }
    public static void RegistrarProducto() {
        for (int i = 0; i < 5; i++) {
            System.out.println(" ingrese el nombe del producto " + (i + 1) + " : ");
            nombre[i] = scanner.nextLine();

            System.out.println(" ingrese el precio del producto " + (i + 1) + " : ");
            precio[i] = scanner.nextInt();

            scanner.nextLine();
        }
        System.out.println("productos registrados correctamente");
    }

    public static void mostrarProductosCaros() {
        boolean hay = false;
        for (int i = 0;i < 5; i++) {
            if (precio[i] > 50000) {
                System.out.println(" siguiente producto el cual es " + nombre[i] + " es mayor por " + precio[i]);
                hay = true;
            }
        }
        if (!hay) {
            System.out.println("No hay productos caros");
        }
        System.out.println();
    }
}
