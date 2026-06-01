/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.gestion.academica;

/**
 *
 * @author Anyel
 */
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaDeGestionAcademica {

    private static ArrayList<Persona> personas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Utilidades.mostrarBienvenida();

        int opcion = 0;

        do {

            try {

                mostrarMenu();

                opcion = Integer.parseInt(scanner.nextLine());

                Validador.validarOpcionMenu(opcion);

                switch (opcion) {

                    case 1:
                        registrarEstudiante();
                        break;

                    case 2:
                        registrarDocente();
                        break;

                    case 3:
                        mostrarPersonas();
                        break;

                    case 4:
                        buscarPersona();
                        break;

                    case 5:
                        ejecutarPolimorfismo();
                        break;

                    case 6:
                        System.out.println("\nGracias por utilizar el sistema.");
                        break;
                }

            } catch (NumberFormatException e) {

                System.out.println(
                        "\nError: Debe ingresar un número válido."
                );

            } catch (IllegalArgumentException e) {

                System.out.println(
                        "\nError: " + e.getMessage()
                );

            } catch (Exception e) {

                System.out.println(
                        "\nError inesperado: " + e.getMessage()
                );
            }

        } while (opcion != 6);
    }

    private static void mostrarMenu() {

        System.out.println("\n========== MENÚ ==========");
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Registrar docente");
        System.out.println("3. Mostrar personas");
        System.out.println("4. Buscar persona");
        System.out.println("5. Ejecutar describirRol()");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void registrarEstudiante() {

        try {

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Identificación: ");
            String identificacion = scanner.nextLine();

            System.out.print("Provincia: ");
            String provincia = scanner.nextLine();

            System.out.print("Ciudad: ");
            String ciudad = scanner.nextLine();

            System.out.print("Carrera: ");
            String carrera = scanner.nextLine();

            Validador.validarNombre(nombre);
            Validador.validarIdentificacion(identificacion);
            Validador.validarProvincia(provincia);
            Validador.validarCiudad(ciudad);
            Validador.validarCarrera(carrera);

            Direccion direccion =
                    new Direccion(provincia, ciudad);

            Estudiante estudiante =
                    new Estudiante(
                            nombre,
                            identificacion,
                            direccion,
                            carrera
                    );

            personas.add(estudiante);

            System.out.println(
                    "\nEstudiante registrado correctamente."
            );

        } catch (DatoInvalidoException e) {

            System.out.println(
                    "\nError: " + e.getMessage()
            );
        }
    }

    private static void registrarDocente() {

        try {

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Identificación: ");
            String identificacion = scanner.nextLine();

            System.out.print("Provincia: ");
            String provincia = scanner.nextLine();

            System.out.print("Ciudad: ");
            String ciudad = scanner.nextLine();

            System.out.print("Especialidad: ");
            String especialidad = scanner.nextLine();

            Validador.validarNombre(nombre);
            Validador.validarIdentificacion(identificacion);
            Validador.validarProvincia(provincia);
            Validador.validarCiudad(ciudad);
            Validador.validarEspecialidad(especialidad);

            Direccion direccion =
                    new Direccion(provincia, ciudad);

            Docente docente =
                    new Docente(
                            nombre,
                            identificacion,
                            direccion,
                            especialidad
                    );

            personas.add(docente);

            System.out.println(
                    "\nDocente registrado correctamente."
            );

        } catch (DatoInvalidoException e) {

            System.out.println(
                    "\nError: " + e.getMessage()
            );
        }
    }

    private static void mostrarPersonas() {

        if (personas.isEmpty()) {

            System.out.println(
                    "\nNo hay personas registradas."
            );

            return;
        }

        System.out.println("\n===== PERSONAS REGISTRADAS =====");

        for (Persona persona : personas) {

            System.out.println("-------------------------");

            System.out.println(
                    "Nombre: " + persona.getNombre()
            );

            persona.mostrarIdentificacion();

            System.out.println(
                    persona.getDireccion()
            );

            persona.describirRol();
        }
    }

    private static void buscarPersona() {

        try {

            System.out.print(
                    "Ingrese la identificación: "
            );

            String identificacion =
                    scanner.nextLine();

            Persona persona =
                    buscarPorIdentificacion(
                            identificacion
                    );

            System.out.println(
                    "\nPersona encontrada:"
            );

            System.out.println(
                    "Nombre: "
                    + persona.getNombre()
            );

            persona.mostrarIdentificacion();

            System.out.println(
                    persona.getDireccion()
            );

            persona.describirRol();

        } catch (DatoInvalidoException e) {

            System.out.println(
                    "\nError: "
                    + e.getMessage()
            );
        }
    }

    /*
     * Ejemplo de propagación de excepciones utilizando throws
     */
    private static Persona buscarPorIdentificacion(
            String identificacion)
            throws DatoInvalidoException {

        try {

            for (Persona persona : personas) {

                if (persona.getIdentificacion()
                        .equals(identificacion)) {

                    return persona;
                }
            }

            throw new Exception();

        } catch (Exception e) {

            throw new DatoInvalidoException(
                    "No existe una persona con la identificación ingresada."
            );
        }
    }

    private static void ejecutarPolimorfismo() {

        if (personas.isEmpty()) {

            System.out.println(
                    "\nNo hay personas registradas."
            );

            return;
        }

        System.out.println(
                "\n===== POLIMORFISMO ====="
        );

        for (Persona persona : personas) {

            persona.describirRol();

            if (persona instanceof Evaluable evaluable) {

                evaluable.evaluar();
            }
        }
    }
}