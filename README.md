# LiteraluraApp

LiteraluraApp es una aplicación de catálogo de libros desarrollada en Java utilizando Spring y Maven. La aplicación se integra con la API de Gutendex para realizar búsquedas de libros y proporciona una interacción textual a través de la consola.

## Características

- Búsqueda de libros utilizando la API de Gutendex.
- Interfaz de usuario basada en consola.
- Arquitectura basada en Spring.
- Gestión de dependencias con Maven.

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes:

- `entity`: Contiene las entidades del dominio.
- `mapper`: Contiene las clases para mapear datos entre diferentes capas.
- `menu`: Contiene la lógica para la interacción con el usuario a través de la consola.
- `model`: Contiene los modelos de datos utilizados en la aplicación.
- `repository`: Contiene las interfaces y clases para la interacción con la base de datos.
- `service`: Contiene la lógica de negocio de la aplicación.
- `util`: Contiene clases utilitarias y helpers.

## Requisitos

- Java 17.
- Maven 3.6.3 o superior.
- IntelliJ IDEA (opcional, pero recomendado).
- Recuerda modificar el localhost, nombre y contraseña para tu base de datos en Resources/application.properties

## Instalación

1. Clona el repositorio:

    ```bash
    git clone https://github.com/tu-usuario/LiteraluraApp.git
    cd LiteraluraApp
    ```

2. Construye el proyecto con Maven:

    ```bash
    mvn clean install
    ```

3. Ejecuta la aplicación:

    ```bash
    mvn spring-boot:run
    ```
   O puedes abrirlo desde  intelliJ IDEA 

## Uso

1. Al iniciar la aplicación, se te presentará un menú en la consola.
2. Sigue las instrucciones en pantalla para buscar libros y explorar el catálogo.


