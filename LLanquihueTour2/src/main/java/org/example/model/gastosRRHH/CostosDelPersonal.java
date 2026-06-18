package org.example.model.gastosRRHH;

/**
 * Representa el cargo y sueldo de un empleado o guía turístico.
 * Se usa por composición en Empleado.
 */
public class CostosDelPersonal {
    // Atributos privados (encapsulamiento)
    private String cargo;
    private double sueldo;

    /**
     * Constructor completo.
     *
     * @param cargo  Cargo o puesto del empleado.
     * @param sueldo Sueldo mensual del empleado.
     */
    public CostosDelPersonal(String cargo, double sueldo) {
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    // Getters y Setters
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) throws Exception{
        if(cargo == null || cargo.isEmpty()){
            throw new Exception("El cargo no puede estar vacio.");
        }
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) throws Exception{
        if(sueldo < 0){
            throw new Exception("El sueldo no puede ser menor a 0.");
        }
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return cargo + " | " + sueldo;
    }
}
