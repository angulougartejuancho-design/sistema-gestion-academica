/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema.gestion.academica;

/**
 *
 * @author Anyel
 */
public class Validador {

    public static void validarNombre(String nombre)
            throws DatoInvalidoException {

        if (nombre == null || nombre.trim().isEmpty()) {

            throw new DatoInvalidoException(
                    "El nombre no puede estar vacío."
            );
        }

        if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {

            throw new DatoInvalidoException(
                    "El nombre solo puede contener letras."
            );
        }
    }

    public static void validarIdentificacion(String identificacion)
            throws DatoInvalidoException {

        if (identificacion == null
                || identificacion.trim().isEmpty()) {

            throw new DatoInvalidoException(
                    "La identificación no puede estar vacía."
            );
        }

        if (!identificacion.matches("\\d+")) {

            throw new DatoInvalidoException(
                    "La identificación solo puede contener números."
            );
        }
    }

    public static void validarProvincia(String provincia)
            throws DatoInvalidoException {

        if (provincia == null || provincia.trim().isEmpty()) {

            throw new DatoInvalidoException(
                    "La provincia no puede estar vacía."
            );
        }

        if (!provincia.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {

            throw new DatoInvalidoException(
                    "La provincia solo puede contener letras."
            );
        }
    }

    public static void validarCiudad(String ciudad)
            throws DatoInvalidoException {

        if (ciudad == null || ciudad.trim().isEmpty()) {

            throw new DatoInvalidoException(
                    "La ciudad no puede estar vacía."
            );
        }

        if (!ciudad.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {

            throw new DatoInvalidoException(
                    "La ciudad solo puede contener letras."
            );
        }
    }

    public static void validarCarrera(String carrera)
            throws DatoInvalidoException {

        if (carrera == null || carrera.trim().isEmpty()) {

            throw new DatoInvalidoException(
                    "La carrera no puede estar vacía."
            );
        }

        if (!carrera.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {

            throw new DatoInvalidoException(
                    "La carrera solo puede contener letras."
            );
        }
    }
    public static void validarEspecialidad(String especialidad)
        throws DatoInvalidoException {

    if (especialidad == null || especialidad.trim().isEmpty()) {
        throw new DatoInvalidoException(
                "La especialidad no puede estar vacía."
        );
    }

    if (!especialidad.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
        throw new DatoInvalidoException(
                "La especialidad solo puede contener letras."
        );
    }
}

    public static void validarOpcionMenu(int opcion)
            throws IllegalArgumentException {

        if (opcion < 1 || opcion > 6) {

            throw new IllegalArgumentException(
                    "Debe seleccionar una opción entre 1 y 6."
            );
        }
    }
}