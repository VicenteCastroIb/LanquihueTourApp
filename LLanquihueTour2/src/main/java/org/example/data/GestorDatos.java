package org.example.data;

import org.example.model.contacto.DatosContacto;
import org.example.model.externos.ProveedorServicio;
import org.example.model.gastosRRHH.CostosDelPersonal;
import org.example.model.persona.clientela.Cliente;
import org.example.model.persona.personalLlanquihue.Empleado;
import org.example.model.persona.personalLlanquihue.GuiaTuristico;
import org.example.model.ubicacion.Direccion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de gestionar las colecciones de datos del sistema.
 * Lee los archivos .txt, carga los objetos en listas y permite
 * buscar, agregar y eliminar registros.
 */

public class GestorDatos {

    // Colecciones para almacenar los objetos cargados desde archivos
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Empleado> listaEmpleados = new ArrayList<>();
    private List<GuiaTuristico> listaGuias = new ArrayList<>();
    private List<ProveedorServicio> listaProveedores = new ArrayList<>();

    // Rutas de los archivos de datos
    File archivoClientes = new File("src/main/resources/Clientes.txt");
    File archivoEmpleados = new File("src/main/resources/Empleados.txt");
    File archivoGuias = new File("src/main/resources/GuiasTuristicos.txt");
    File archivoProveedores = new File("src/main/resources/ProveedoresExternos.txt");

    // ========================= Clientes ========================= //

    /** Muestra todos los clientes por consola. */
    public void obtenerClientes() {
        for(Cliente cliente : listaClientes){
            System.out.println(cliente);
        }
    }

    /** Busca clientes cuyo nombre contenga el texto dado (sin importar mayúsculas). */
    public ArrayList<Cliente> obtenerClienteXNombre(String nombre) {
        ArrayList<Cliente> clientesEncontrados = new ArrayList<>();
        for(Cliente cliente : listaClientes){
            if(cliente.getNombre().toLowerCase().contains(nombre.toLowerCase())){
                clientesEncontrados.add(cliente);
            }
        }
        return clientesEncontrados;
    }

    /** Elimina un cliente por su objeto. */
    public void borrarCliente (Cliente cliente){
        listaClientes.remove(cliente);
    }

    /** Elimina un cliente por su código. */
    public void borrarClienteXCodigo(String codigo) {
        listaClientes.removeIf(cliente -> cliente.getCodigoCliente().equalsIgnoreCase(codigo));
    }

    /** Agrega un cliente a la lista, valida que no sea nulo. */
    public void anadirCLiente(Cliente cliente) throws Exception{
        if(cliente == null){
            throw new Exception("Error en formato Cliente.");
        }
        listaClientes.add(cliente);
    }

    /**
     * Lee el archivo Clientes.txt y carga los datos en la lista.
     * Formato esperado: nombre;apellido;rut;correo;telefono;calle;numero;ciudad;region;codigoPostal;codigoCliente;tipoCliente;totalTours
     */
    public void leerArchivoClientes() {
        try(BufferedReader br = new BufferedReader(new FileReader(archivoClientes))){
            String linea = br.readLine();
            while(linea != null){
                String[] datos = linea.split(";");
                DatosContacto contacto = new DatosContacto(datos[3], datos[4]);
                Direccion direccion = new Direccion(datos[5], datos[6], datos[7], datos[8], datos[9]);
                Cliente cliente = new Cliente(datos[0], datos[1], datos[2], contacto, direccion, datos[10], datos[11], Integer.parseInt(datos[12]));
                anadirCLiente(cliente);
                linea = br.readLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // ========================= Empleados ========================= //

    /** Muestra todos los empleados por consola. */
    public void obtenerEmpleado(){
        for(Empleado empleado : listaEmpleados){
            System.out.println(empleado);
        }
    }

    /** Busca empleados cuyo nombre contenga el texto dado (sin importar mayúsculas). */
    public ArrayList<Empleado> obtenerEmpleadoXNombre(String nombre){
        ArrayList<Empleado> empleadosEncontrados = new ArrayList<>();
        for(Empleado empleado : listaEmpleados){
            if(empleado.getNombre().toLowerCase().contains(nombre.toLowerCase())){
                empleadosEncontrados.add(empleado);
            }
        }
        return empleadosEncontrados;
    }

    /** Elimina un empleado por su objeto. */
    public void borrarEmpleado(Empleado empleado) {
        listaEmpleados.remove(empleado);
    }

    /** Elimina un empleado por su código. */
    public void borrarEmpleadosXCodigo(String codigo) {
        listaEmpleados.removeIf(empleado -> empleado.getCodigoEmpleado().equalsIgnoreCase(codigo));
    }

    /** Agrega un empleado a la lista. */
    public void aniadirEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    /**
     * Lee el archivo Empleados.txt y carga los datos en la lista.
     * Formato esperado: nombre;apellido;rut;correo;telefono;calle;numero;ciudad;region;codigoPostal;cargo;sueldo;fechaIngreso;codigoEmpleado
     */
    public void leerArchivoEmpleados(){
        try(BufferedReader br = new BufferedReader(new FileReader(archivoEmpleados))){
            String linea = br.readLine();
            while(linea != null){
                String[] datos = linea.split(";");
                DatosContacto contacto = new DatosContacto(datos[3], datos[4]);
                Direccion direccion = new Direccion(datos[5], datos[6], datos[7], datos[8], datos[9]);
                CostosDelPersonal costoPersonal = new CostosDelPersonal(datos[10], Double.parseDouble(datos[11]));
                Empleado empleado = new Empleado(datos[2], datos[0], datos[1], contacto, direccion, costoPersonal, datos[12], datos[13], Boolean.parseBoolean(datos[14]));
                aniadirEmpleado(empleado);
                linea = br.readLine();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // ========================= Guias Turisticos ========================= //

    /** Muestra todos los guías turísticos por consola. */
    public void obtenerGuia() {
        for(GuiaTuristico guia : listaGuias){
            System.out.println(guia);
        }
    }
    /** Busca guías cuyo nombre contenga el texto dado (sin importar mayúsculas). */
    public ArrayList<GuiaTuristico> obtenerGuiaXNombre (String nombre) {
        ArrayList<GuiaTuristico> guiasEncontrados = new ArrayList<>();
        for(GuiaTuristico guia : listaGuias){
            if(guia.getNombre().toLowerCase().contains(nombre.toLowerCase())){
                guiasEncontrados.add(guia);
            }
        }

        return guiasEncontrados;
    }

    /** Elimina un guía por su objeto. */
    public void borrarGuia(GuiaTuristico guia){
        listaGuias.remove(guia);
    }

    /** Elimina un guía por su código. */
    public void borrarGuiaXCodigo(String codigo) {
        listaGuias.removeIf(guia -> guia.getCodigoGuia().equalsIgnoreCase(codigo));
    }

    /** Agrega un guía a la lista. */
    public void aniadirGuia (GuiaTuristico guia) {
        listaGuias.add(guia);
    }

    /**
     * Lee el archivo GuiasTuristicos.txt y carga los datos en la lista.
     * Formato esperado: nombre;apellido;rut;correo;telefono;calle;numero;ciudad;region;codigoPostal;cargo;sueldo;fechaIngreso;tipoTours;idiomas;toursRealizados;activo;codigoGuia
     */
    public void leerArchivoGuiasTuristicos(){
        try(BufferedReader br = new BufferedReader(new FileReader(archivoGuias))){
            String linea = br.readLine();
            while(linea != null){
                String[] datos = linea.split(";");
                DatosContacto contacto = new DatosContacto(datos[3], datos[4]);
                Direccion direccion = new Direccion(datos[5], datos[6], datos[7], datos[8], datos[9]);
                CostosDelPersonal costoPersonal = new CostosDelPersonal(datos[10], Double.parseDouble(datos[11]));
                GuiaTuristico guia = new GuiaTuristico(datos[2], datos[0], datos[1], contacto, direccion, costoPersonal,datos[12], datos[13], datos[14], Integer.parseInt(datos[15]), Boolean.parseBoolean(datos[16]), datos[17]);
                aniadirGuia(guia);
                linea = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // ========================= Proveedores Externos ========================= //

    /** Muestra todos los proveedores por consola. */
    public void obtenerProveedor() {
        for(ProveedorServicio proveedor : listaProveedores){
            System.out.println(proveedor);
        }
    }

    /** Busca proveedores cuyo nombre de empresa contenga el texto dado (sin importar mayúsculas). */
    public ArrayList<ProveedorServicio> obtenerProveedorXNombre (String nombre) {
        ArrayList<ProveedorServicio> proveedoresEncontrados = new ArrayList<>();
        for(ProveedorServicio proveedor : listaProveedores){
            if(proveedor.getNombreEmpresa().toLowerCase().contains(nombre.toLowerCase())){
                proveedoresEncontrados.add(proveedor);
            }
        }

        return proveedoresEncontrados;
    }

    /** Agrega un proveedor a la lista. */
    public void aniadirProveedor(ProveedorServicio proveedor) {
        listaProveedores.add(proveedor);
    }

    /** Elimina un proveedor por su objeto. */
    public void borrarProveedor(ProveedorServicio proveedor) {
        listaProveedores.remove(proveedor);
    }

    /** Elimina un proveedor por su código. */
    public void borrarProveedorXCodigo(String codigo) {
        listaProveedores.removeIf(proveedor -> proveedor.getCodigoProveedor().equalsIgnoreCase(codigo));
    }

    /**
     * Lee el archivo ProveedoresExternos.txt y carga los datos en la lista.
     * Formato esperado: nombreEmpresa;tipoServicio;codigoProveedor;contactoNombre;correo;telefono;calle;numero;ciudad;region;codigoPostal;activo;costos
     * Nota: activo en el archivo usa "Si"/"No".
     */
    public void leerArchivoProveedores(){
        try(BufferedReader br = new BufferedReader(new FileReader(archivoProveedores))){
            String linea = br.readLine();
            while(linea != null){
                String[] datos = linea.split(";");
                DatosContacto contacto = new DatosContacto(datos[4], datos[5]);
                Direccion direccion = new Direccion(datos[6], datos[7], datos[8], datos[9], datos[10]);
                ProveedorServicio proveedor = new ProveedorServicio(datos[2], datos[0], datos[1],datos[3],contacto, direccion, Double.parseDouble(datos[12]), Boolean.parseBoolean(datos[11]));
                aniadirProveedor(proveedor);
                linea = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
