package com.example;

import java.util.Scanner;
import java.util.ArrayList;

public class AnalisisNota {
static    Scanner scanner = new Scanner(System.in);
static    ArrayList<Double> notas = new ArrayList<>();
    public static void main(String[] args) {
        int opciones;

        do {
            mostrarMenu();
            opciones = scanner.nextInt();
            scanner.nextLine();
            switch (opciones) {
                case 1:
                    RegistrarNotas();
                    break;
            case 2:
            CalcularPromedio();
            break;

            case 3:
            System.out.println(" Hasta luego!!! ");
            break;
                default:
                System.out.println("opcion incorrecta (elegir numeros de las opciones ) ");
                    break;
            }
        } while (opciones != 3);
    }

        public static void mostrarMenu() {
        System.out.println("\n=== MENÚ DE OPCIONES ===");
        System.out.println("1. Registrar notas de los estudiantes");
        System.out.println("2. Calcular promedio y contar aprobados");
        System.out.println("3. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void RegistrarNotas() {
        notas.clear();  //borra notas anteriores si las hay

        for (int i = 0; i < 10; i++) {
            double nota;

            do {
                System.out.println(" ingrese la nota del estudiante # " + (i + 1) + " entre 0 y 5 ");
                nota = scanner.nextDouble();
                if (nota < 0 || nota > 5) {
                    System.out.println(" error la nota debe ser entre 0 y 5 ");
                }
            } while (nota < 0 || nota > 5);
            notas.add(nota);
        }
        System.out.println(" nota registrada en el sistema correctamente ");
    }

    public static void CalcularPromedio() {
        if (notas.isEmpty()) {
            System.out.println(" el programa no detecta notas. favor de registrarlas en el sistema ");
            return;
        }
        double suma = 0;
        int aprobados = 0;

        for (double nota : notas) {
            suma += nota;
            if (nota >= 3.5) {
                aprobados++;
            }
        }

        double promedio = suma / notas.size();

        System.out.println("\nResultados del análisis:");
        System.out.println("Promedio general: " + promedio);
        System.out.println("Estudiantes aprobados (>= 3.5): " + aprobados);
        System.out.println("Estudiantes reprobados (< 3.5): " + (notas.size() - aprobados));
    }
}
