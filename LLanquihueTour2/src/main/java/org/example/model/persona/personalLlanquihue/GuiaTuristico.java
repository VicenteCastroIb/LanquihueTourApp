package org.example.model.persona.personalLlanquihue;

import org.example.model.contacto.DatosContacto;
import org.example.model.gastosRRHH.CostosDelPersonal;
import org.example.model.ubicacion.Direccion;

/**
 * Representa a un guía turístico de Llanquihue Tour.
 * Hereda de Empleado y agrega atributos propios del rol de guía.
 */
public class GuiaTuristico extends Empleado {

    // Atributos adicionales privados
    private String tipoTours;
    private String idiomas;
    private int toursRealizados;

    /**
     * Constructor completo.
     *
     * @param rut             RUT del guía.
     * @param nombre          Nombre del guía.
     * @param apellido        Apellido del guía.
     * @param contacto        Correo y teléfono.
     * @param direccion       Dirección de residencia.
     * @param costoPersonal   Cargo y sueldo mensual.
     * @param fechaIngreso    Fecha de ingreso a la empresa.
     * @param tipoTours       Tipo de tours que realiza.
     * @param idiomas         Idiomas que domina.
     * @param toursRealizados Cantidad de tours realizados.
     * @param activo          Indica si el guía está activo.
     * @param codigoGuia      Código único del guía (se usa también como codigoEmpleado).
     */
    public GuiaTuristico(String rut, String nombre, String apellido, DatosContacto contacto, Direccion direccion, CostosDelPersonal costoPersonal, String fechaIngreso, String tipoTours, String idiomas, int toursRealizados, boolean activo, String codigoGuia) {
        super(rut, nombre, apellido, contacto, direccion, costoPersonal, fechaIngreso, codigoGuia, activo);
        this.tipoTours = tipoTours;
        this.idiomas = idiomas;
        this.toursRealizados = 0;
    }

    // Getters y Setters

    // Retorna el código del guía usando el getter heredado de Empleado
    public String getCodigoGuia() {return getCodigoEmpleado();}
    public String getTipoTours() {
        return tipoTours;
    }

    public void setTipoTours(String tipoTours) throws Exception{
        if(tipoTours == null || tipoTours.isEmpty()){
            throw new Exception("El tipo de tours no puede estar vacio.");
        }
        this.tipoTours = tipoTours;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) throws Exception{
        if(idiomas == null || idiomas.isEmpty()){
            throw new Exception("Los idiomas no pueden estar vacios.");
        }
        this.idiomas = idiomas;
    }

    public int getToursRealizados() {
        return toursRealizados;
    }

    public void setToursRealizados(int toursRealizados) throws Exception{
        if(toursRealizados < 0){
            throw new Exception("Los tours realizados no pueden ser menor a 0.");
        }
        this.toursRealizados = toursRealizados;
    }

    /**
     * Incrementa en uno la cantidad de tours realizados.
     */
    public void registrarTourRealizado() {
        this.toursRealizados++;
    }

    /**
     * Determina la categoría del guía según tours realizados.
     *
     * @return "Guia Experto" si tiene mas de 50 tours, "Guia Intermedio" si tiene mas de 20, "Guia Novato" en otro caso.
     */
    public String getExperiencia() {
        if (toursRealizados >= 50) {
            return "Guia Experto";
        } else if (toursRealizados >= 20) {
            return "Guia Intermedio";
        } else {
            return "Guia Novato";
        }
    }

    /**
     * Representación legible del guía turístico.
     *
     * @return Datos del guía turístico.
     */
    @Override
    public String toString() {
        return "Guia Turistico - rut: '" + getRut() + " | " +
                "Nombre: " + getNombre() + " | " +
                "Apellido: " + getApellido() + " | " +
                "TipoTours: " + tipoTours + " | " +
                "Idiomas: " + idiomas + " | " +
                "ToursRealizados: " + toursRealizados + " | " +
                "Experiencia: " + getExperiencia() + " | " +
                "Direccion: " + getDireccion() + " | " +
                "Contacto: " + getContacto() + " | " +
                "CodigoGuia " + getCodigoGuia() + " | " +
                "Cargo: " + getCostoPersonal().getCargo() + " | " +
                "Sueldo: " + getCostoPersonal().getSueldo();
    }
}
