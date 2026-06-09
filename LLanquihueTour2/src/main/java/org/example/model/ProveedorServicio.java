package org.example.model;

/**
 * Representa a un proveedor externo de servicios para Llanquihue Tour.
 * Aplica composición con la clase Direccion.
 */
public class ProveedorServicio {

    // Atributos (encapsulamiento)
    private String codigoProveedor;
    private String nombreEmpresa;
    private String tipoServicio;
    private String contactoNombre;
    private String contactoCorreo;
    private String contactoTelefono;
    private Direccion direccion;
    private boolean activo;
    private double costos;

    /**
     * Constructor completo.
     *
     * @param codigoProveedor  Código único del proveedor.
     * @param nombreEmpresa    Nombre de la empresa.
     * @param tipoServicio     Tipo de servicio que ofrece.
     * @param contactoNombre   Nombre del contacto principal.
     * @param contactoCorreo   Correo del contacto.
     * @param contactoTelefono Teléfono del contacto.
     * @param direccion        Dirección de la empresa.
     * @param costos           Costos del servicio.
     */
    public ProveedorServicio(String codigoProveedor, String nombreEmpresa, String tipoServicio, String contactoNombre, String contactoCorreo, String contactoTelefono, Direccion direccion, double costos) {
        this.codigoProveedor = codigoProveedor;
        this.nombreEmpresa = nombreEmpresa;
        this.tipoServicio = tipoServicio;
        this.contactoNombre = contactoNombre;
        this.contactoCorreo = contactoCorreo;
        this.contactoTelefono = contactoTelefono;
        this.direccion = direccion;
        this.costos = costos;
        this.activo = true;
    }

    // Getters y Setters

    public String getCodigoProveedor() { return codigoProveedor; }
    public void setCodigoProveedor(String codigoProveedor) { this.codigoProveedor = codigoProveedor; }

    public String getNombreEmpresa() { return nombreEmpresa; }
    public void setNombreEmpresa(String nombreEmpresa) { this.nombreEmpresa = nombreEmpresa; }

    public String getTipoServicio() { return tipoServicio; }
    public void setTipoServicio(String tipoServicio) { this.tipoServicio = tipoServicio; }

    public String getContactoNombre() { return contactoNombre; }
    public void setContactoNombre(String contactoNombre) { this.contactoNombre = contactoNombre; }

    public String getContactoCorreo() { return contactoCorreo; }
    public void setContactoCorreo(String contactoCorreo) { this.contactoCorreo = contactoCorreo; }

    public String getContactoTelefono() { return contactoTelefono; }
    public void setContactoTelefono(String contactoTelefono) { this.contactoTelefono = contactoTelefono; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    public double getCostos() { return costos; }
    public void setCostos(double costos) { this.costos = costos; }

    /**
     * Representación legible de un proveedor de servicios.
     *
     * @return Información del proveedor de servicios.
     */
    @Override
    public String toString() {
        return "Proveedor - codigoProveedor: '" + codigoProveedor + '\'' +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", tipoServicio='" + tipoServicio + '\'' +
                ", contactoNombre='" + contactoNombre + '\'' +
                ", contactoCorreo='" + contactoCorreo + '\'' +
                ", contactoTelefono='" + contactoTelefono + '\'' +
                ", direccion=" + direccion +
                ", activo=" + activo +
                ", costos=" + costos +
                '}';
    }
}
