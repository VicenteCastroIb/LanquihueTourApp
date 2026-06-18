package org.example.model.contacto;

/**
 * Almacena el correo y teléfono de contacto de una persona o empresa.
 * Se usa por composición en DatosPersonales y ProveedorServicio.
 */
public class DatosContacto {
    // Atributos privados (encapsulamiento)
    private String correo;
    private String telefono;

    /**
     * Constructor completo.
     *
     * @param correo   Correo electrónico.
     * @param telefono Número de teléfono.
     */
    public DatosContacto(String correo, String telefono) {
        this.correo = correo;
        this.telefono = telefono;
    }

    // Getters y Setters

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) throws Exception{
        if(correo == null || correo.isEmpty()){
            throw new Exception("Correo no puede estar vacio.");
        }
        this.correo = correo;
    }

    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) throws Exception{
        if(telefono == null || telefono.isEmpty()){
            throw new Exception("El telefono no puede estar vacio.");
        }
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Correo " + correo + " | Telefono: " + telefono;
    }
}
