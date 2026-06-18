package org.example.model.persona.personalLlanquihue;

import org.example.model.contacto.DatosContacto;
import org.example.model.gastosRRHH.CostosDelPersonal;
import org.example.model.persona.DatosPersonales;
import org.example.model.ubicacion.Direccion;

/**
 * Representa a un empleado de Llanquihue Tour.
 * Hereda de DatosPersonales y agrega atributos laborales.
 * Aplica agregacion con CostosDelPersonal.
 */
public class Empleado extends DatosPersonales {

    // Atributos adicionales privados
    private CostosDelPersonal costoPersonal;
    private String fechaIngreso;
    private boolean activo;
    private String codigoEmpleado;

    /**
     * Constructor completo.
     *
     * @param rut            RUT del empleado.
     * @param nombre         Nombre del empleado.
     * @param apellido       Apellido del empleado.
     * @param contacto       Correo y teléfono.
     * @param direccion      Dirección de residencia.
     * @param costoPersonal  Cargo y sueldo del empleado.
     * @param fechaIngreso   Fecha de ingreso a la empresa.
     * @param codigoEmpleado Código único del empleado.
     * @param activo         Indica si el empleado está activo.
     */
    public Empleado(String rut, String nombre, String apellido, DatosContacto contacto, Direccion direccion, CostosDelPersonal costoPersonal, String fechaIngreso, String codigoEmpleado, boolean activo) {
        super(rut, nombre, apellido, contacto, direccion);
        this.costoPersonal = costoPersonal;
        this.fechaIngreso = fechaIngreso;
        this.activo = activo;
        this.codigoEmpleado = codigoEmpleado;
    }

    // Getters y Setters

    public String getCodigoEmpleado(){return codigoEmpleado;}
    public CostosDelPersonal getCostoPersonal() {
        return costoPersonal;
    }

    public void setCostoPersonal(CostosDelPersonal costoPersonal) {
        this.costoPersonal = costoPersonal;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) throws Exception{
        if(fechaIngreso == null || fechaIngreso.isEmpty()){
            throw new Exception("La fecha no puede estar vacia.");
        }
        this.fechaIngreso = fechaIngreso;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * Representación legible del empleado.
     *
     * @return Datos del empleado .
     */
    @Override
    public String toString() {
        return "Empleado - rut: " + getRut() + " | " +
                "Nombre: " + getNombre() + " | " +
                "Apellido: " + getApellido() + " | " +
                "CodigoEmpleado: " + codigoEmpleado + " | " +
                "Direccion=" + getDireccion() + " | " +
                "Cargo: " + costoPersonal.getCargo() + " | " +
                "Sueldo: " + costoPersonal.getSueldo() + " | " +
                "FechaIngreso: " + fechaIngreso + " | " +
                "Activo: " + activo;
    }
}
