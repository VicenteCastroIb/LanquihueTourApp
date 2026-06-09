package org.example.model;

/**
 * Clase base que representa a cualquier persona vinculada a Llanquihue Tour.
 * Clientes, Empleados, Guías heredan de esta clase.
 */
public class Persona {

    // Atributos (encapsulamiento)
    private String rut;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private Direccion direccion;

    /**
     * Constructor con todos los parámetros.
     *
     * @param rut       RUT de la persona.
     * @param nombre    Nombre.
     * @param apellido  Apellido.
     * @param correo    Correo de contacto.
     * @param telefono  Número de teléfono.
     * @param direccion Dirección asociada a la persona.
     */
    public Persona(String rut, String nombre, String apellido, String correo, String telefono, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    // Getters y Setters

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }


    /**
     * Representación legible de la persona.
     *
     * @return Todos los atributos de la persona.
     */
    @Override
    public String toString() {
        return "Persona - rut: '" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
