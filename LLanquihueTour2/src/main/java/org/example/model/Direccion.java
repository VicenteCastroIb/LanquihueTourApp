package org.example.model;
/**
 * Clase que representa la dirección de una persona / proveedor.
 * Se usa como atributo de composición en Persona y Proveedor
 */
public class Direccion {

    // Atributos privados (encapsulamiento)
    private String calle;
    private String numero;
    private String ciudad;
    private String region;
    private String codigoPostal;

    /**
     * Constructor con todos los parámetros.
     *
     * @param calle        Nombre de la calle.
     * @param numero       Número de casa.
     * @param ciudad       Ciudad.
     * @param region       Región del país.
     * @param codigoPostal Código postal.
     */
    public Direccion(String calle, String numero, String ciudad, String region, String codigoPostal) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
        this.region = region;
        this.codigoPostal = codigoPostal;
    }

    // Getters y Setters

    public String getCalle() { return calle; }
    public void setCalle(String calle) { this.calle = calle; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }

    public String getCodigoPostal() { return codigoPostal; }
    public void setCodigoPostal(String codigoPostal) { this.codigoPostal = codigoPostal; }

    /**
     * Representación legible de la dirección.
     *
     * @return Datos de la dirección.
     */
    @Override
    public String toString() {
        return "Direccion - calle: '" + calle + '\'' +
                ", numero='" + numero + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", region='" + region + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                '}';
    }
}
