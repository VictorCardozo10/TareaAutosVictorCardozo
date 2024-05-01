/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.victorcardozo;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TareaVictorCardozo {
    private ArrayList<Registro> registros;
    private Scanner sc;

    // Constructor
    public TareaVictorCardozo() {
        registros = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    // Método para mostrar el menú principal
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1 - Registrar nuevo registro");
            System.out.println("2 - Buscar registro");
            System.out.println("3 - Editar registro");
            System.out.println("4 - Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = obtenerEntero();

            switch (opcion) {
                case 1:
                    registrarRegistro();
                    break;
                case 2:
                    buscarRegistro();
                    break;
                case 3:
                    editarRegistro();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Error. Inntentar de nuevo");
            }
        } while (opcion != 4);
    }

    // Método para registrar un nuevo registro
    private void registrarRegistro() {
        System.out.println("\n--- Registro de nuevo registro ---");
        System.out.print("Ingrese el ID: ");
        int id = obtenerEntero();
        System.out.print("Ingrese la marca: ");
        String marca = sc.next();
        System.out.print("Ingrese el modelo: ");
        String modelo = sc.next();
        System.out.print("Ingrese el anho: ");
        int año = obtenerEntero();
        System.out.print("Ingrese el tipo: ");
        String tipo = sc.next();
        System.out.print("Ingrese el numero de chasis: ");
        String numeroChasis = sc.next();
        System.out.print("Ingrese el color: ");
        String color = sc.next();

        registros.add(new Registro(id, marca, modelo, año, tipo, numeroChasis, color));
        System.out.println("Registro añadido correctamente.");
    }

    // Método para buscar un registro por ID
    private void buscarRegistro() {
        System.out.print("\nIngrese el ID a buscar: ");
        int idBuscar = obtenerEntero();

        boolean encontrado = false;
        for (Registro registro : registros) {
            if (registro.getId() == idBuscar) {
                registro.mostrarInfo();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Registro no encontrado.");
        }
    }

    // Método para editar un registro por ID
    private void editarRegistro() {
        System.out.print("\nIngrese el ID del registro a editar: ");
        int idEditar = obtenerEntero();

        boolean encontrado = false;
        for (Registro registro : registros) {
            if (registro.getId() == idEditar) {
                System.out.println("\n--- Edicion de registro ---");
                System.out.print("Ingrese la nueva marca: ");
                registro.setMarca(sc.next());
                System.out.print("Ingrese el nuevo modelo: ");
                registro.setModelo(sc.next());
                System.out.print("Ingrese el nuevo anho: ");
                registro.setAño(obtenerEntero());
                System.out.print("Ingrese el nuevo tipo: ");
                registro.setTipo(sc.next());
                System.out.print("Ingrese el nuevo numero de chasis: ");
                registro.setNumeroChasis(sc.next());
                System.out.print("Ingrese el nuevo color: ");
                registro.setColor(sc.next());
                System.out.println("Registro editado correctamente.");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Registro no encontrado.");
        }
    }

    // Método para obtener un entero validado
    private int obtenerEntero() {
        int entero = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                entero = sc.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, introduce un numero entero valido.");
                sc.next(); // Limpiar el buffer del Scanner
            }
        }
        return entero;
    }

    // Método principal para iniciar la aplicación
    public static void main(String[] args) {
        TareaVictorCardozo aplicacion = new TareaVictorCardozo();
        aplicacion.mostrarMenu();
    }
}



