# LlanquihueTour2

## Descripción

Llanquihue Tour es una agencia de turismo ubicada en la comuna de Llanquihue, Región de Los Lagos. Este sistema modela de forma estructurada las entidades involucradas en sus operaciones, aplicando principios de programación orientada a objetos: encapsulamiento, herencia, composición y reutilización de clases.

## Autor

**Vicente Castro**  
Estudiante Analista Programador — DUOC UC

## Estructura del proyecto

```
LlanquihueTour2/
└── src/main/java/org/example/
    ├── app/
    │   └── Main.java               ← Clase principal, ejecuta el sistema
    └── model/
        ├── Persona.java            ← Clase base para todas las personas
        ├── Direccion.java          ← Clase de composición (dirección postal)
        ├── Empleado.java           ← Extiende Persona, agrega datos laborales
        ├── GuiaTuristico.java      ← Extiende Empleado, especialización de guía
        ├── Cliente.java            ← Extiende Persona, representa clientes
        └── ProveedorServicio.java  ← Proveedor externo, usa composición con Direccion
```

### Relaciones entre clases

- **Composición:** `Persona` y `ProveedorServicio` contienen un objeto `Direccion`.
- **Herencia:** `Empleado` extiende `Persona` → `GuiaTuristico` extiende `Empleado` → `Cliente` extiende `Persona`.

## Instrucciones para compilar y ejecutar

### Requisitos

- Java JDK 17 o superior
- IntelliJ IDEA (recomendado) o cualquier IDE compatible con Maven
- Maven 3.x

### Pasos

1. Clona el repositorio:

```bash
git clone https://github.com/tu-usuario/LlanquihueTour2.git
```

2. Abre el proyecto en IntelliJ IDEA:
   - `File` → `Open` → selecciona la carpeta del proyecto

3. Espera que Maven descargue las dependencias automáticamente.

4. Ejecuta la clase principal:
   - Navega a `src/main/java/org/example/app/Main.java`
   - Clic derecho → `Run 'Main.main()'`

5. La salida por consola mostrará los datos de todos los objetos instanciados: personas, empleados, guías turísticos, clientes y proveedores.

