package com.example;

import java.util.*;

public class main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
                do {
                    mostrarMenu();
                    opcion = sc.nextInt();
                    sc.nextLine();

            switch (opcion) {
                case 1: 
                ejercicio1();
                    break;
                case 2: 
                ejercicio2();
                    break;
                case 3:  
                ejercicio3();
                    break;
                case 4: 
                ejercicio4();
                    break;
                case 5: 
                ejercicio5();
                    break;
                case 6: 
                ejercicio6();
                    break;
                case 7: 
                ejercicio7();
                    break;
                case 8: 
                ejercicio8();
                    break;
                case 9: 
                ejercicio9();
                    break;
                case 10: 
                ejercicio10();
                    break;
                case 0: 
                System.out.println("Saliendo del programa...");
                    break;
                default: 
                System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 0);
    }

public static void mostrarMenu() {
                System.out.println("\n===== MENÚ DE EJERCICIOS =====");
            System.out.println("1. Control de precios en una tienda");
            System.out.println("2. Registro de horas de trabajadores");
            System.out.println("3. Análisis de notas escolares");
            System.out.println("4. Simulación de retiro en cajero automático");
            System.out.println("5. Revisión de ventas diarias");
            System.out.println("6. Priorización de pacientes");
            System.out.println("7. Evaluación de productos fabricados");
            System.out.println("8. Horarios de transporte público");
            System.out.println("9. Clasificación de compras");
            System.out.println("10. Monitoreo de temperatura ambiental");
            System.out.println("0. Salir");
            System.out.println("===============================");
            System.out.print("Seleccione una opción: ");
}

    

    public static void ejercicio1() {
        String[] nombres = new String[5];
        double[] precios = new double[5];

        System.out.println("\nEjercicio 1: Control de precios en una tienda");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre del producto " + (i + 1) + ": ");
            nombres[i] = sc.next();
            System.out.print("Precio del producto " + (i + 1) + ": ");
            precios[i] = sc.nextDouble();
        }

        System.out.println("Productos con precio mayor a 50.000 COP:");
        for (int i = 0; i < 5; i++) {
            if (precios[i] > 50000) {
                System.out.println(nombres[i] + " - $" + precios[i]);
            }
        }
    }

    public static void ejercicio2() {
        double[][] horas = new double[3][5];

        System.out.println("\nEjercicio 2: Registro de horas");
        for (int i = 0; i < 3; i++) {
            System.out.println("Trabajador " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("  Día " + (j + 1) + " (horas): ");
                horas[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < 3; i++) {
            double total = 0;
            for (int j = 0; j < 5; j++) {
                total += horas[i][j];
            }
            System.out.println("Total horas trabajadas por el trabajador " + (i + 1) + ": " + total);
        }
    }

    public static void ejercicio3() {
        ArrayList<Double> notas = new ArrayList<>();
        System.out.println("\nEjercicio 3: Análisis de notas");

        for (int i = 0; i < 10; i++) {
            System.out.print("Nota del estudiante " + (i + 1) + ": ");
            notas.add(sc.nextDouble());
        }

        double suma = 0;
        int aprobados = 0;
        for (double nota : notas) {
            suma += nota;
            if (nota >= 3.5) aprobados++;
        }

        System.out.println("Promedio: " + (suma / notas.size()));
        System.out.println("Aprobados: " + aprobados);
    }

    public static void ejercicio4() {
        int[] billetes = {100000, 50000, 20000, 10000};

        System.out.println("\nEjercicio 4: Cajero automático");
        System.out.print("Ingrese el monto a retirar (múltiplo de 10.000): ");
        int monto = sc.nextInt();

        if (monto % 10000 != 0) {
            System.out.println("Monto inválido.");
            return;
        }

        for (int billete : billetes) {
            int cantidad = monto / billete;
            if (cantidad > 0) {
                System.out.println("Billetes de " + billete + ": " + cantidad);
                monto %= billete;
            }
        }
    }

    public static void ejercicio5() {
        double[] ventas = new double[7];

        System.out.println("\nEjercicio 5: Revisión de ventas");
        for (int i = 0; i < 7; i++) {
            System.out.print("Venta del día " + (i + 1) + ": ");
            ventas[i] = sc.nextDouble();
        }

        int mayor = 0, menor = 0;
        for (int i = 1; i < 7; i++) {
            if (ventas[i] > ventas[mayor]) mayor = i;
            if (ventas[i] < ventas[menor]) menor = i;
        }

        System.out.println("Mayor venta: Día " + (mayor + 1) + " - $" + ventas[mayor]);
        System.out.println("Menor venta: Día " + (menor + 1) + " - $" + ventas[menor]);
    }

    public static void ejercicio6() {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> prioridades = new ArrayList<>();

        System.out.println("\nEjercicio 6: Priorización de pacientes");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nombre del paciente " + (i + 1) + ": ");
            nombres.add(sc.next());
            System.out.print("Prioridad (1=alta, 2=media, 3=baja): ");
            prioridades.add(sc.nextInt());
        }

        System.out.println("Pacientes ordenados por prioridad:");
        for (int p = 1; p <= 3; p++) {
            for (int i = 0; i < 5; i++) {
                if (prioridades.get(i) == p) {
                    System.out.println("Prioridad " + p + ": " + nombres.get(i));
                }
            }
        }
    }

    public static void ejercicio7() {
        int[] estado = new int[50];
        int buenos = 0, defectuosos = 0;

        System.out.println("\nEjercicio 7: Evaluación de productos");
        for (int i = 0; i < 50; i++) {
            System.out.print("Producto " + (i + 1) + " (1=bueno, 0=defectuoso): ");
            estado[i] = sc.nextInt();
            if (estado[i] == 1) buenos++;
            else defectuosos++;
        }

        double porcentajeDefectos = (defectuosos / 50.0) * 100;
        System.out.println("Buenos: " + buenos);
        System.out.println("Defectuosos: " + defectuosos);
        System.out.printf("Porcentaje de defectos: %.2f%%\n", porcentajeDefectos);
    }

    public static void ejercicio8() {
        double[] horarios = {7.00, 9.30, 12.00, 14.30, 17.00, 19.30};

        System.out.println("\nEjercicio 8: Horarios de buses");
        System.out.print("Ingrese la hora actual (formato 24h): ");
        double hora = sc.nextDouble();

        boolean encontrado = false;
        for (double h : horarios) {
            if (h > hora) {
                System.out.println("Próximo bus disponible a las " + h + " horas.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("No hay más buses disponibles hoy.");
        }
    }

    public static void ejercicio9() {
        ArrayList<Double> compras = new ArrayList<>();
        int pequeno = 0, mediano = 0, grande = 0;

        System.out.println("\nEjercicio 9: Clasificación de compras");
        for (int i = 0; i < 8; i++) {
            System.out.print("Compra del cliente " + (i + 1) + ": ");
            double compra = sc.nextDouble();
            compras.add(compra);

            if (compra < 50000) pequeno++;
            else if (compra <= 100000) mediano++;
            else grande++;
        }

        System.out.println("Compras pequeñas: " + pequeno);
        System.out.println("Compras medianas: " + mediano);
        System.out.println("Compras grandes: " + grande);
    }

    public static void ejercicio10() {
        double[] temperaturas = new double[12];
        int altas = 0, bajas = 0;

        System.out.println("\nEjercicio 10: Monitoreo de temperatura");
        for (int i = 0; i < 12; i++) {
            System.out.print("Temperatura hora " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
            if (temperaturas[i] > 35) altas++;
            if (temperaturas[i] < 20) bajas++;
        }

        System.out.println("Temperaturas >35°C: " + altas);
        System.out.println("Temperaturas <20°C: " + bajas);
    }
}
