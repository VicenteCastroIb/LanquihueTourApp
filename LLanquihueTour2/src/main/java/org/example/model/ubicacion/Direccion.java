package org.example.model.ubicacion;
/**
 * Representa la dirección de una persona o proveedor.
 * Se usa por agregacion en DatosPersonales y ProveedorServicio.
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
    public void setCalle(String calle) throws Exception {
        if (calle == null || calle.isEmpty()) {
            throw new Exception("La calle no puede estar vacia.");
        }
        this.calle = calle;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) throws Exception {
        if(numero == null || numero.isEmpty()){
            throw new Exception("Numero no puede estar vacio.");
        }
        this.numero = numero;
    }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) throws Exception {
        if (ciudad == null || ciudad.isEmpty()) {
            throw new Exception("La ciudad no puede estar vacia.");
        }
        this.ciudad = ciudad;
    }

    public String getRegion() { return region; }
    public void setRegion(String region) throws Exception{
        if(region == null || region.isEmpty()){
            throw new Exception("Region no puede estar vacia.");
        }
        this.region = region; }

    public String getCodigoPostal() { return codigoPostal; }
    public void setCodigoPostal(String codigoPostal) throws Exception{
        if(codigoPostal == null || codigoPostal.isEmpty()){
            throw new Exception("Codigo Postal no puede estar vacio.");
        }
        this.codigoPostal = codigoPostal; }

    @Override
    public String toString() {
        return "Calle: " + calle + " | " +
                "Numero: " + numero + " | " +
                "Ciudad: " + ciudad + " | " +
                "Region: " + region + " | " +
                "CodigoPostal: " + codigoPostal + " | ";
    }
}
