package com.example;

import java.util.Scanner;
import java.util.ArrayList;

public class CentroSalud {

static Scanner scanner = new Scanner(System.in);
static ArrayList<String> nombres = new ArrayList<>();
static ArrayList<Integer> prioridades = new ArrayList<>();
static boolean pacientesRegistrados = false;
    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    RegistrarPacientes();
                    break;
            
                    case 2:
                    MostrarPrioridades();
                    break;

                    case 3:
                    System.out.println(" Hasta pronto!!! ");
                    break;

                default:
                System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 3);
    }

    public static void mostrarMenu() {
        System.out.println("\n=== MENÚ CENTRO DE SALUD ===");
        System.out.println("1. Registrar pacientes");
        System.out.println("2. Mostrar pacientes por prioridad");
        System.out.println("3. Salir");
        System.out.print("Selecciona una opción: ");
    }

    public static void RegistrarPacientes() {
        nombres.clear();
        prioridades.clear();

        for (int i = 0; i < 3; i++) {
            System.out.println(" ingrese el nombre del usuario # " + (i + 1));
            String nombre = scanner.nextLine();
            int prioridad;

            do {
                System.out.println(" ingrese su prioridad (1 = alta, 2 = media, 3 = baja): ");
                prioridad = scanner.nextInt();
                scanner.nextLine();
            } while (prioridad < 1 || prioridad > 3);
            //se registra en el dato en el array list
            nombres.add(nombre);
            prioridades.add(prioridad);
        }
        pacientesRegistrados = true;
        System.out.println(" el usuario ha sido registrado ");
    }

    public static void MostrarPrioridades() {
        System.out.println(" lista de pacientes ordenados por prioridad ");
        for (int prioridad = 1; prioridad <= 3; prioridad++) {
            for (int i = 0; i < prioridades.size(); i++ ) {
                if (prioridades.get(i) == prioridad) {
                    String tipoprioridad = "";

                    switch (prioridad) {
                        case 1:
                            tipoprioridad = "alta";
                            break;
                        case 2:
                            tipoprioridad = "media";
                            break;
                        
                        case 3:
                            tipoprioridad = "baja";
                            break;
                    }
                    System.out.println(" paciente: " + (i + 1) + "# " + nombres.get(i) + " prioridad tipo: " + tipoprioridad);
                }
            }
        }
    }
}
