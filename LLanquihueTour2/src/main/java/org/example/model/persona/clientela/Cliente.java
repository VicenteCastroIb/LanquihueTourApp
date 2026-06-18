package org.example.model.persona.clientela;

import org.example.model.contacto.DatosContacto;
import org.example.model.persona.DatosPersonales;
import org.example.model.ubicacion.Direccion;

/**
 * Representa a un cliente de Llanquihue Tour.
 * Hereda de DatosPersonales y agrega atributos propios del cliente.
 */
public class Cliente extends DatosPersonales {

    // Atributos adicionales
    private String codigoCliente;
    private String tipoCliente;
    private int totalTours;

    /**
     * Constructor completo.
     *
     * @param nombre        Nombre del cliente.
     * @param apellido      Apellido del cliente.
     * @param rut           RUT del cliente.
     * @param contacto      Correo y teléfono.
     * @param direccion     Dirección de residencia.
     * @param codigoCliente Código único asignado por la agencia.
     * @param tipoCliente   Categoría del cliente (VIP, Regular, Premium, etc).
     * @param totalTours    Cantidad de tours realizados.
     */
    public Cliente(String nombre, String apellido, String rut, DatosContacto contacto, Direccion direccion, String codigoCliente, String tipoCliente, int totalTours) {
        super(rut, nombre, apellido, contacto, direccion);
        this.codigoCliente = codigoCliente;
        this.tipoCliente = tipoCliente;
        this.totalTours = 0;
    }

    // Getters y Setters

    public String getCodigoCliente() { return codigoCliente; }
    public void setCodigoCliente(String codigoCliente) throws Exception{
        if(codigoCliente == null || codigoCliente.isEmpty()){
            throw new Exception("El codigo no puede estar vacio.");
        }
        this.codigoCliente = codigoCliente;
    }

    public String getTipoCliente() { return tipoCliente; }
    public void setTipoCliente(String tipoCliente) throws Exception {
        if(tipoCliente == null || tipoCliente.isEmpty()){
            throw new Exception("El tipo de cliente no puede estar vacio.");
        }
        this.tipoCliente = tipoCliente; }

    public int getTotalTours() { return totalTours; }
    public void setTotalTours(int totalTours) { this.totalTours = totalTours; }

    /**
     * Registra la participación del cliente en un nuevo tour.
     */
    public void agregarTour() {
        this.totalTours++;
    }

    /**
     * Representación legible del cliente.
     *
     * @return Datos del cliente.
     */
    @Override
    public String toString() {
        return "Cliente - rut: " + getRut() + " | " +
                "Nombre:" + getNombre() + " | " +
                "Apellido: " + getApellido() + " | " +
                "Contacto: " + getContacto() + " | " +
                "Direccion: " + getDireccion() + " | " +
                "CodigoCliente: " + codigoCliente + " | " +
                "TipoCliente: " + tipoCliente + " | " +
                "TotalTours: " + totalTours;
    }
}
