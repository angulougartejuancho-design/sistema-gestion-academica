/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.gestion.academica;

/**
 *
 * @author Daryelin
 */
public class Docente extends Persona{
     private String especialidad;

    // Constructor usando super
    public Docente(String nombre, String identificacion, Direccion direccion, String especialidad) {
        super(nombre, identificacion, direccion);
        this.especialidad = especialidad;
    }

    // Getter
    public String getEspecialidad() {
        return especialidad;
    }

    // Setter
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Método sobrescrito
    @Override
    public void describirRol() {
        System.out.println("Soy un docente especializado en " + especialidad);
    } 
}
