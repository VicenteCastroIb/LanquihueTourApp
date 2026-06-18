# LlanquihueTourApp

## Descripción

Sistema de gestión para la agencia de turismo **Llanquihue Tour**, ubicada en la Región de Los Lagos. La aplicación permite registrar, consultar, buscar y eliminar información de clientes, empleados, guías turísticos y proveedores externos, cargando los datos desde archivos de texto (.txt) y almacenándolos en colecciones dinámicas.

---

## Paquetes y clases implementadas

### `model.persona`
- **DatosPersonales** – Clase base con atributos comunes de toda persona (rut, nombre, apellido, contacto, dirección).

### `model.persona.clientela`
- **Cliente** – Hereda de DatosPersonales. Agrega código de cliente, tipo de cliente y total de tours realizados.

### `model.persona.personalLlanquihue`
- **Empleado** – Hereda de DatosPersonales. Agrega cargo, sueldo, fecha de ingreso y código de empleado.
- **GuiaTuristico** – Hereda de Empleado. Agrega tipo de tours, idiomas, tours realizados y nivel de experiencia.

### `model.contacto`
- **DatosContacto** – Almacena correo y teléfono. Usado por agregacion en DatosPersonales y ProveedorServicio.

### `model.ubicacion`
- **Direccion** – Almacena calle, número, ciudad, región y código postal. Usado por agregacion.

### `model.gastosRRHH`
- **CostosDelPersonal** – Almacena cargo y sueldo. Usado por agregacion en Empleado.

### `model.externos`
- **ProveedorServicio** – Representa a un proveedor externo con nombre de empresa, tipo de servicio, contacto, dirección y costos.

### `data`
- **GestorDatos** – Lee los archivos .txt, carga los objetos en colecciones (ArrayList) y permite listar, buscar y eliminar registros.

### `ui`
- **Main** – Clase principal que ejecuta el programa, llama al gestor de datos y muestra los resultados por consola.

---

## Estructura del proyecto

```
LlanquihueTourApp/
├── src/
│   └── main/
│       ├── java/
│       │   └── org/example/
│       │       ├── data/
│       │       │   └── GestorDatos.java
│       │       ├── model/
│       │       │   ├── contacto/
│       │       │   │   └── DatosContacto.java
│       │       │   ├── externos/
│       │       │   │   └── ProveedorServicio.java
│       │       │   ├── gastosRRHH/
│       │       │   │   └── CostosDelPersonal.java
│       │       │   ├── persona/
│       │       │   │   ├── DatosPersonales.java
│       │       │   │   ├── clientela/
│       │       │   │   │   └── Cliente.java
│       │       │   │   └── personalLlanquihue/
│       │       │   │       ├── Empleado.java
│       │       │   │       └── GuiaTuristico.java
│       │       │   └── ubicacion/
│       │       │       └── Direccion.java
│       │       └── ui/
│       │           └── Main.java
│       └── resources/
│           ├── Clientes.txt
│           ├── Empleados.txt
│           ├── GuiasTuristicos.txt
│           └── ProveedoresExternos.txt
```

---

## Formato de los archivos .txt

Cada archivo usa `;` como separador.

**Clientes.txt**
```
nombre;apellido;rut;correo;telefono;calle;numero;ciudad;region;codigoPostal;codigoCliente;tipoCliente;totalTours
```

**Empleados.txt**
```
nombre;apellido;rut;correo;telefono;calle;numero;ciudad;region;codigoPostal;cargo;sueldo;fechaIngreso;codigoEmpleado;activo
```

**GuiasTuristicos.txt**
```
nombre;apellido;rut;correo;telefono;calle;numero;ciudad;region;codigoPostal;cargo;sueldo;fechaIngreso;tipoTours;idiomas;toursRealizados;activo;codigoGuia
```

**ProveedoresExternos.txt**
```
nombreEmpresa;tipoServicio;codigoProveedor;contactoNombre;correo;telefono;calle;numero;ciudad;region;codigoPostal;activo;costos
```

---

## Instrucciones para ejecutar

### Requisitos
- Java 17 o superior
- IntelliJ IDEA (recomendado)

### Pasos

1. Clona el repositorio:
```bash
git clone https://github.com/VicenteCastroIb/LlanquihueTourApp.git
```

2. Abre el proyecto en IntelliJ IDEA con **File → Open**.

3. Asegúrate de que los archivos `.txt` estén en `src/main/resources/`.

4. Ejecuta la clase principal:
```
org.example.ui.Main
```

5. La consola mostrará los datos cargados, búsquedas y eliminaciones para cada entidad.

---

## Tecnologías utilizadas

- Java 17
- Programación Orientada a Objetos (herencia, composición, encapsulamiento)
- Colecciones: `ArrayList`
- Lectura de archivos: `BufferedReader`, `FileReader`
