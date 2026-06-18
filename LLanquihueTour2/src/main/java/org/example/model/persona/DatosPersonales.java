package org.example.model.persona;

import org.example.model.ubicacion.Direccion;
import org.example.model.contacto.*;
/**
 * Clase base que representa a cualquier persona vinculada a Llanquihue Tour.
 * Clientes, Empleados, Guías heredan de esta clase.
 */
public class DatosPersonales {

    // Atributos (encapsulamiento)
    private String rut;
    private String nombre;
    private String apellido;
    private DatosContacto contacto;
    private Direccion direccion;

    /**
     * Constructor completo.
     *
     * @param rut       RUT de la persona.
     * @param nombre    Nombre de la persona.
     * @param apellido  Apellido de la persona.
     * @param contacto  Correo y teléfono.
     * @param direccion Dirección de residencia.
     */
    public DatosPersonales(String rut, String nombre, String apellido, DatosContacto contacto, Direccion direccion) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contacto = contacto;
        this.direccion = direccion;
    }

    // Getters y Setters

    public String getRut() { return rut; }
    public void setRut(String rut) throws Exception{
        if(rut == null || rut.isEmpty()){
            throw new Exception("El rut no puede estar vacio.");
        }
        this.rut = rut;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) throws Exception{
        if(nombre == null || nombre.isEmpty()){
            throw new Exception("El nombre no puede estar vacio.");
        }
        this.nombre = nombre;
    }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) throws Exception{
        if(apellido == null || apellido.isEmpty()){
            throw new Exception("El apellido no puede estar vacio.");
        }
        this.apellido = apellido;
    }

    public DatosContacto getContacto() {
        return contacto;
    }
    public void setContacto(DatosContacto contacto) {
        this.contacto = contacto;
    }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }


    /**
     * Representación legible de la persona.
     *
     * @return Todos los atributos de la persona.
     */
    @Override
    public String toString() {
        return "Persona - rut: '" + rut + " | " +
                "Nombre: | " + nombre + " | " +
                "Apellido: " + apellido + " | " +
                "Correo: " + contacto + " | " +
                direccion;
    }
}
