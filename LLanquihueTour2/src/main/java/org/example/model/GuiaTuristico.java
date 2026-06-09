package org.example.model;

/**
 * Representa a un guía turístico de Llanquihue Tour.
 */
public class GuiaTuristico extends Empleado {

    // Atributos adicionales privados
    private String tipoTours;
    private String idiomas;
    private int toursRealizados;

    /**
     * Constructor completo.
     *
     * @param rut          RUT del guía.
     * @param nombre       Nombre.
     * @param apellido     Apellido.
     * @param correo       Correo de contacto.
     * @param telefono     Teléfono.
     * @param direccion    Dirección de residencia.
     * @param sueldo       Sueldo mensual.
     * @param fechaIngreso Fecha de ingreso.
     * @param tipoTours    Tipo de tours que realiza.
     * @param idiomas      Idiomas que domina.
     */
    public GuiaTuristico(String rut, String nombre, String apellido, String correo, String telefono, Direccion direccion, double sueldo, String fechaIngreso, String tipoTours, String idiomas) {
        super(rut, nombre, apellido, correo, telefono, direccion, "Guía Turístico", sueldo, fechaIngreso);
        this.tipoTours = tipoTours;
        this.idiomas = idiomas;
        this.toursRealizados = 0;
    }

    // Getters y Setters

    public String getTipoTours() { return tipoTours; }
    public void setTipoTours(String tipoTours) { this.tipoTours = tipoTours; }

    public String getIdiomas() { return idiomas; }
    public void setIdiomas(String idiomas) { this.idiomas = idiomas; }

    public int getToursRealizados() { return toursRealizados; }
    public void setToursRealizados(int toursRealizados) { this.toursRealizados = toursRealizados; }

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
        return "Guia Turistico - rut: '" + getRut() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", tipoTours='" + tipoTours + '\'' +
                ", idiomas='" + idiomas + '\'' +
                ", toursRealizados=" + toursRealizados +
                ", experiencia='" + getExperiencia() + '\'' +
                ", direccion=" + getDireccion() +
                '}';
    }
}
