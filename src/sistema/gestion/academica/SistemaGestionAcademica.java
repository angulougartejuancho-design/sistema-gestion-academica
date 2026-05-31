/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.gestion.academica;

import java.util.ArrayList;
/**
 *
 * @author angul
 */
public class SistemaGestionAcademica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mostrar bienvenida
        Utilidades.mostrarBienvenida();

        // Crear lista polimórfica de Persona
        ArrayList<Persona> personas = new ArrayList<>();

        // Crear direcciones
        Direccion direccion1 =
                new Direccion("San José", "Desamparados");

        Direccion direccion2 =
                new Direccion("Alajuela", "Grecia");

        // Crear estudiante
        Estudiante estudiante =
                new Estudiante(
                        "Daniel",
                        "12345",
                        direccion1,
                        "Ingeniería en Sistemas"
                );

        // Crear docente
        Docente docente =
                new Docente(
                        "María",
                        "67890",
                        direccion2,
                        "Programación"
                );

        // Agregar objetos a la lista
        personas.add(estudiante);
        personas.add(docente);

        // Recorrer lista polimórfica
        System.out.println("\nLISTA DE PERSONAS:");

        for (Persona persona : personas) {

            System.out.println("--------------------------------");

            System.out.println(
                    "Nombre: " + persona.getNombre()
            );

            // Método final
            persona.mostrarIdentificacion();

            // Método polimórfico
            persona.describirRol();

            // Mostrar dirección
            System.out.println(
                    persona.getDireccion()
            );

            /*
             * instanceof verifica si el objeto
             * implementa la interfaz Evaluable.
             */
            if (persona instanceof Evaluable evaluable) {

                evaluable.evaluar();
            }
        }

        System.out.println("--------------------------------");
        System.out.println("Fin de la ejecución del sistema.");
    }
}
   

