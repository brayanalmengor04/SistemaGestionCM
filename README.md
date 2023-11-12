
# Sistema de Sincronización de Base de Datos para CreaccionesMagicas

Este repositorio contiene un sistema que proporciona una solución accesible y sencilla para la sincronización con la base de datos en el negocio CreaccionesMagicas. 

## Flujo de Ejecución

En tiempo de ejecución, el programa sigue el siguiente flujo:

1. **Login**: El login proporciona seguridad para el sistema.
   ![Login](/readmeimg/login.PNG)

2. **Crear Cuenta**: Permite a los usuarios crear cuentas en el sistema.
   ![Crear Cuenta](/readmeimg/crearCuenta.PNG)

3. **Pantalla Principal**: Interfaz principal que facilita la navegación por el sistema.
   ![Pantalla Principal](/readmeimg/paginaPrincipal.PNG)

El programa ofrece las siguientes funcionalidades:

- Gestión de productos y servicios.
- Gestión de reseñas.
- Generación de facturaciones.

---



## Estructura del Proyecto

El repositorio está organizado en los siguientes paquetes:

1. **com.creaccionesmagicas.controllers**: Este paquete contiene los controladores y funciones asociadas a cada nodo de ventana.

2. **com.creaccionesmagicas.dominio**: Aquí se encuentran todas las clases u objetos que se utilizarán en el sistema como entidades.

3. **com.creaccionesmagicas.negocio**: Encargado de la lógica y funcionalidades que impactan las clases del paquete 'dominio', interactuando con las tablas de la base de datos.

4. **com.creaccionesmagicas.views**: Almacena los archivos FXML, es decir, las vistas o nodos que se utilizan en el programa.

5. **com.creaccionesmagicas.resources**: Organiza las imágenes utilizadas en el programa, así como los estilos CSS para mejorar la estética.

## Ejemplos Representativos

A continuación se presentan imágenes representativas de cada sección del sistema:

- **com.creaccionesmagicas.controllers**:
  [Carpeta repositorio de controladores](/src/com/creaccionesmagicas/controllers/)
  ![Controladores](/readmeimg/controller.PNG)


- **com.creaccionesmagicas.dominio**:
  [Repositorio de las clases/objetos del dominio](/src/com/creaccionesmagicas/dominio/)
  ![Dominio](/readmeimg/dominioNegocio.PNG)

- **com.creaccionesmagicas.negocio**:
  [Repositorio de la lógica y funcionalidades](/src/com/creaccionesmagicas/negocio/)
   ![Dominio](/readmeimg/dominioNegocio.PNG)

- **com.creaccionesmagicas.views**:
  [Repositorio de archivos FXML o vistas](/src/com/creaccionesmagicas/views/)
  ![views](/readmeimg/views.PNG)

- **com.creaccionesmagicas.resources**:
  [Repositorio de recursos: imágenes y estilos CSS](/src/com/creaccionesmagicas/resources/)
  ![Resources](/readmeimg/resources.PNG)
  
### Explicación Adicional

El sistema se estructura de manera que los controladores se encargan de las funciones de cada nodo ventana, el paquete de dominio contiene las clases u objetos utilizados en el sistema, el paquete de negocio incorpora la lógica que afecta a las clases de dominio y las tablas de la base de datos, las vistas se almacenan en el paquete de vistas (archivos FXML), y finalmente, el paquete de recursos organiza las imágenes y los estilos CSS para mejorar la apariencia del programa.

---

