/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.gestion.academica;

/**
 *
 * @author angul
 */
public class Direccion {
    
    private String provincia;
    private String ciudad;

    // Constructor
    public Direccion(String provincia, String ciudad) {
        this.provincia = provincia;
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public String toString() {
        return "Provincia: " + provincia + " | Ciudad: " + ciudad;
    }
    
}
