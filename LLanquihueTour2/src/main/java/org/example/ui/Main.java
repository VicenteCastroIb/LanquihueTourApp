package org.example.ui;

import org.example.data.GestorDatos;

/**
 * Clase principal del sistema Llanquihue Tour.
 * Carga los datos desde archivos y demuestra las operaciones
 * de listado, búsqueda y eliminación de cada entidad.
 */
public class Main {

    public static void main(String[] args) {

        GestorDatos gestor = new GestorDatos();

        // ============ Clientes ============ //
        System.out.println("===== CLIENTES =====");
        gestor.leerArchivoClientes();
        gestor.obtenerClientes();

        System.out.println("\n--- Buscar cliente por nombre: Juan ---");
        System.out.println(gestor.obtenerClienteXNombre("Juan"));

        System.out.println("\n--- Eliminar cliente CLI005 ---");
        gestor.borrarClienteXCodigo("CLI005");
        gestor.obtenerClientes();

        // ============ Empleados ============ //
        System.out.println("\n===== EMPLEADOS =====");
        gestor.leerArchivoEmpleados();
        gestor.obtenerEmpleado();

        System.out.println("\n--- Buscar empleado por nombre: Carolina ---");
        System.out.println(gestor.obtenerEmpleadoXNombre("Carolina"));

        System.out.println("\n--- Eliminar empleado EMP003 ---");
        gestor.borrarEmpleadosXCodigo("EMP003");
        gestor.obtenerEmpleado();

        // ============ Guias Turisticos ============ //
        System.out.println("\n===== GUIAS TURÍSTICOS =====");
        gestor.leerArchivoGuiasTuristicos();
        gestor.obtenerGuia();

        System.out.println("\n--- Buscar guia por nombre: Pedro ---");
        System.out.println(gestor.obtenerGuiaXNombre("Pedro"));

        System.out.println("\n--- Eliminar guia GUI003 ---");
        gestor.borrarGuiaXCodigo("GUI003");
        gestor.obtenerGuia();

        // ============ Proveedores ============ //
        System.out.println("\n===== PROVEEDORES =====");
        gestor.leerArchivoProveedores();
        gestor.obtenerProveedor();

        System.out.println("\n--- Buscar proveedor por nombre: Aventuras ---");
        System.out.println(gestor.obtenerProveedorXNombre("Aventuras"));

        System.out.println("\n--- Eliminar proveedor PROV003 ---");
        gestor.borrarProveedorXCodigo("PROV003");
        gestor.obtenerProveedor();
    }
}
