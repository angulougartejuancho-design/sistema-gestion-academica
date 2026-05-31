/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.gestion.academica;

/**
 *
 * @author angul
 */
public abstract class Persona {

    
    private String nombre;
    private String identificacion;
    private Direccion direccion;
    
    public static final String PAIS = "Costa Rica";

    // Constructor
    public Persona(String nombre, String identificacion, Direccion direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public final void mostrarIdentificacion() {
        System.out.println("Identificación: " + identificacion);
    }

    
    public abstract void describirRol();
}
