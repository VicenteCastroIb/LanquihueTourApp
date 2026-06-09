package org.example.app;

import org.example.model.Cliente;
import org.example.model.Direccion;
import org.example.model.Empleado;
import org.example.model.GuiaTuristico;
import org.example.model.Persona;
import org.example.model.ProveedorServicio;
/**
 * Clase principal del sistema Llanquihue Tour.
 * Instancia objetos de todas las clases y muestra los resultados por consola.
 */
public class Main {

    public static void main(String[] args) {

        // Personas
        Direccion dirPersona1 = new Direccion("Alameda", "4554", "Pucon", "Los Lagos", "322333");
        Persona persona1 = new Persona("23.123.123-3", "Roberto", "Sotero", "robert@gmail.com", "+56 9 23444121", dirPersona1);
        System.out.println(persona1);
        System.out.println();

        Direccion dirPersona2 = new Direccion("6 Oriente", "132", "Vina Del Mar", "Valparaiso", "1200000");
        Persona persona2 = new Persona("12.324.123-4", "Mateo", "Robertoli", "robertoli@gmail.com", "+56 9 12345678", dirPersona2);
        System.out.println(persona2);
        System.out.println();

        // Empleados
        Direccion dirEmpleado1 = new Direccion("Las Mareas", "4321", "Llanquihue", "Los Lagos", "430000");
        Empleado empleado1 = new Empleado("12.345.678-9", "Sofia", "Castana", "sofi@gmail.com", "+56 9 32323232", dirEmpleado1, "Gerente de asuntos sin importancia", 900000, "06/12/2022");
        System.out.println(empleado1);
        System.out.println();

        Direccion dirEmpleado2 = new Direccion("Acacias", "122", "Llanquihue", "Los Lagos", "556000");
        Empleado empleado2 = new Empleado(
                "13.578.677-4", "Ignacio", "Rojas",
                "nacho@gmail.com", "+56 9 54646564", dirEmpleado2,
                "Asistente del gerente", 800000, "22/01/2024");
        System.out.println(empleado2);
        System.out.println();

        // Guias turisticos
        Direccion dirGuia1 = new Direccion("Av. Costanera", "789", "Llanquihue", "Los Lagos", "570000");
        GuiaTuristico guia1 = new GuiaTuristico("13.765.432-1", "Sebastian", "Perez", "sebastian.perez@llanquihuetour.cl", "+56 9 6677 8899", dirGuia1, 880000, "10/01/2017", "Tours Lacustres", "Español, Inglés");
        for (int i = 0; i < 55; i++) {
            guia1.registrarTourRealizado();
        }
        System.out.println(guia1);
        System.out.println();

        Direccion dirGuia2 = new Direccion("Alameda 2", "321", "Puerto Varas", "Los Lagos", "54000");
        GuiaTuristico guia2 = new GuiaTuristico("17.654.321-8", "Rosario", "Pinto", "dilaverdadrosa@gmail.com", "+56 9 48673953", dirGuia2, 890000, "05/09/2020", "Rutas Gastronómicas", "Español, Chino, Inglés");
        for (int i = 0; i < 22; i++) {
            guia2.registrarTourRealizado();
        }
        System.out.println(guia2);
        System.out.println();

        // Clientes
        Direccion dirCliente1 = new Direccion("Apoquindo", "110", "Santiago", "Metropolitana", "100000");
        Cliente cliente1 = new Cliente("12.345.123-4", "Fernanda", "Lagos", "fernanda.lagos@gmail.com", "+56 9 1122 3344", dirCliente1, "C-200", "Adulto");
        for (int i = 0; i < 6; i++) {
            cliente1.agregarTour();
        }
        System.out.println(cliente1);
        System.out.println();

        Direccion dirCliente2 = new Direccion("Gaviotas", "132", "Vina Del Mar", "Valparaiso", "402222");
        Cliente cliente2 = new Cliente("65.454.343-2", "Homero", "Simpson", "homer@gmail.com", "+56 9 65666765", dirCliente2, "C-201", "Adulto"
        );
        System.out.println(cliente2);
        System.out.println();

        // Proveedores
        Direccion dirProv1 = new Direccion("Torres Del Bosque", "1222", "Llanquihue", "Los Lagos", "760000");
        ProveedorServicio proveedor1 = new ProveedorServicio("P-111", "Equipo Aventura.", "Proveedor de equipos", "Roberto", "robertotototo@gmail.com", "+56 9 54333234", dirProv1, 100000);
        System.out.println(proveedor1);
        System.out.println();

        Direccion dirProv2 = new Direccion("Calle Santos", "321", "Pucon", "La Araucania", "123333");
        ProveedorServicio proveedor2 = new ProveedorServicio("P-112", "Alimentos del sur", "Proveedor de alimentos", "Claudia", "clau@gmail.com", "+56 9 23666543", dirProv2, 120000);
        System.out.println(proveedor2);
        System.out.println();

        Direccion dirProv3 = new Direccion("Av. Licanto", "510", "Puerto Varas", "Los Lagos", "544000");
        ProveedorServicio proveedor3 = new ProveedorServicio("P-113", "Transportes Surenos", "Proveedor de transporte", "Almendra", "alme@gmail.com", "+56 9 32222123", dirProv3, 30000);
        System.out.println(proveedor3);
        System.out.println();
    }
}
