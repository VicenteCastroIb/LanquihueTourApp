package org.example.model.externos;

import org.example.model.ubicacion.Direccion;
import org.example.model.contacto.*;
/**
 * Representa a un proveedor externo de servicios para Llanquihue Tour.
 */
public class ProveedorServicio {

    // Atributos (encapsulamiento)
    private String codigoProveedor;
    private String nombreEmpresa;
    private String tipoServicio;
    private String contactoNombre;
    private DatosContacto contacto;
    private Direccion direccion;
    private boolean activo;
    private double costos;

    /**
     * Constructor completo.
     *
     * @param codigoProveedor Código único del proveedor.
     * @param nombreEmpresa   Nombre de la empresa.
     * @param tipoServicio    Tipo de servicio que ofrece.
     * @param contactoNombre  Nombre del contacto principal.
     * @param contacto        Correo y teléfono del contacto.
     * @param direccion       Dirección de la empresa.
     * @param costos          Costos del servicio.
     * @param activo          Indica si el proveedor está activo.
     */
    public ProveedorServicio(String codigoProveedor, String nombreEmpresa, String tipoServicio, String contactoNombre, DatosContacto contacto, Direccion direccion, double costos, boolean activo) {
        this.codigoProveedor = codigoProveedor;
        this.nombreEmpresa = nombreEmpresa;
        this.tipoServicio = tipoServicio;
        this.contactoNombre = contactoNombre;
        this.contacto = contacto;
        this.direccion = direccion;
        this.costos = costos;
        this.activo = activo;
    }

    // Getters y Setters

    public String getCodigoProveedor() {
        return codigoProveedor;
    }
    public void setCodigoProveedor(String codigoProveedor) throws Exception{
        if(codigoProveedor == null || codigoProveedor.isEmpty()){
            throw new Exception("Este dato no puede estar vacio.");
        }
        this.codigoProveedor = codigoProveedor;
    }

    public String getNombreEmpresa() {return nombreEmpresa;}
    public void setNombreEmpresa(String nombreEmpresa) throws Exception{
        if(nombreEmpresa == null || nombreEmpresa.isEmpty()){
            throw new Exception("Este dato no puede estar vacio.");
        }
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTipoServicio() {return tipoServicio;}
    public void setTipoServicio(String tipoServicio) throws Exception{
        if(tipoServicio == null || tipoServicio.isEmpty()){
            throw new Exception("Este dato no puede estar vacio.");
        }
        this.tipoServicio = tipoServicio;
    }

    public String getContactoNombre() {return contactoNombre;}

    public void setContactoNombre(String contactoNombre) throws Exception{
        if(contactoNombre == null || contactoNombre.isEmpty()){
            throw new Exception("Este dato no puede estar vacio.");
        }
        this.contactoNombre = contactoNombre;
    }

    public DatosContacto getContacto() {return contacto;}
    public void setContacto(DatosContacto contacto) throws Exception {
        if (contacto == null){
            throw new Exception("Error al agregar contacto");
        }
        this.contacto = contacto;
    }

    public Direccion getDireccion() {
        return direccion;
    }
    public void setDireccion(Direccion direccion) throws Exception {
        if(direccion == null){
            throw new Exception("Error al agregar direccion.");
        }
        this.direccion = direccion;
    }

    public boolean isActivo() {
        return activo;
    }

    public double getCostos() {
        return costos;
    }

    public void setCostos(double costos) throws Exception{
        if(costos < 0){
            throw new Exception("El costo no puede ser negativo.");
        }
        this.costos = costos;
    }

    @Override
    public String toString(){
        return nombreEmpresa + " | " +
                tipoServicio + " | " +
                codigoProveedor + " | " +
                contactoNombre + " | " +
                contacto + " | " +
                direccion + " | " +
                activo + " | " +
                costos;
    }
}
