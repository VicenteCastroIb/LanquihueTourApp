package org.example.model;

/**
 * Representa a un empleado de Llanquihue Tour.
 * Hereda de Persona y agrega atributos propios del rol laboral.
 */
public class Empleado extends Persona {

    // Atributos adicionales privados
    private String cargo;
    private double sueldo;
    private String fechaIngreso;
    private boolean activo;

    /**
     * Constructor completo.
     *
     * @param rut          RUT del empleado.
     * @param nombre       Nombre.
     * @param apellido     Apellido.
     * @param correo       Correo de contacto.
     * @param telefono     Teléfono.
     * @param direccion    Dirección de residencia.
     * @param cargo        Cargo en la empresa.
     * @param sueldo       Sueldo mensual en CLP.
     * @param fechaIngreso Fecha de ingreso a la empresa.
     */
    public Empleado(String rut, String nombre, String apellido, String correo, String telefono, Direccion direccion, String cargo, double sueldo, String fechaIngreso) {
        super(rut, nombre, apellido, correo, telefono, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.fechaIngreso = fechaIngreso;
        this.activo = true;
    }

    // Getters y Setters

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSueldo() { return sueldo; }
    public void setSueldo(double sueldo) { this.sueldo = sueldo; }

    public String getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(String fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    public boolean isActivo() { return activo; }
    public void setActivo(boolean activo) { this.activo = activo; }

    /**
     * Representación legible del empleado.
     *
     * @return Datos del empleado .
     */
    @Override
    public String toString() {
        return "Empleado - rut: '" + getRut() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", cargo='" + cargo + '\'' +
                ", sueldo=" + sueldo +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                ", activo=" + activo +
                ", direccion=" + getDireccion() +
                '}';
    }
}
