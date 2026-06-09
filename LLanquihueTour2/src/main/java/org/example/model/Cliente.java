package org.example.model;
/**
 * Representa a un cliente de Llanquihue Tour.
 * Hereda de Persona y agrega atributos propios.
 */
public class Cliente extends Persona {

    // Atributos adicionales
    private String codigoCliente;
    private String tipoCliente;
    private int totalTours;

    /**
     * Constructor completo.
     *
     * @param rut           RUT.
     * @param nombre        Nombre.
     * @param apellido      Apellido.
     * @param correo        Correo de contacto.
     * @param telefono      Teléfono.
     * @param direccion     Dirección de residencia.
     * @param codigoCliente Código asignado por la agencia.
     * @param tipoCliente   Categoría del cliente (ej: Discapacitado, ninio, adulto, Adulto Mayor).
     */
    public Cliente(String rut, String nombre, String apellido, String correo, String telefono, Direccion direccion, String codigoCliente, String tipoCliente) {
        super(rut, nombre, apellido, correo, telefono, direccion);
        this.codigoCliente = codigoCliente;
        this.tipoCliente = tipoCliente;
        this.totalTours = 0;
    }

    // Getters y Setters

    public String getCodigoCliente() { return codigoCliente; }
    public void setCodigoCliente(String codigoCliente) { this.codigoCliente = codigoCliente; }

    public String getTipoCliente() { return tipoCliente; }
    public void setTipoCliente(String tipoCliente) { this.tipoCliente = tipoCliente; }

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
        return "Cliente - rut='" + getRut() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", codigoCliente='" + codigoCliente + '\'' +
                ", tipoCliente='" + tipoCliente + '\'' +
                ", totalTours=" + totalTours +
                ", direccion=" + getDireccion() +
                '}';
    }
}
