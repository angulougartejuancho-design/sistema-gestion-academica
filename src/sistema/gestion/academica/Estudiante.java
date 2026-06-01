/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.gestion.academica;

/**
 *
 * @author Daryelin
 */
public class Estudiante extends Persona implements Evaluable {

    private String carrera;

    /**
     * Constructor de la clase Estudiante
     * utilizando super para heredar atributos.
     */
    public Estudiante(String nombre, String identificacion,
            Direccion direccion, String carrera) {

        super(nombre, identificacion, direccion);
        this.carrera = carrera;
    }

    /**
     * Getter de carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Setter de carrera
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Método sobrescrito de Persona
     */
    @Override
    public void describirRol() {

        System.out.println(
                "Soy un estudiante de la carrera de " + carrera
        );
    }

    /**
     * Implementación del método evaluar
     * de la interfaz Evaluable.
     */
    @Override
    public void evaluar() {

        System.out.println(
                "El estudiante ha sido evaluado correctamente."
        );
    }
}