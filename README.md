# Tienda Virtual - Backend

Este proyecto es la implementación del backend de una aplicación de tienda virtual desarrollada en **Java 17** utilizando **Spring Boot**. El objetivo de esta aplicación es gestionar productos, usuarios, pedidos y roles de administración en una tienda virtual.

## Funcionalidades principales

- Gestión de usuarios (clientes y administradores) con roles diferenciados.
- Gestión de productos (creación, actualización, eliminación y visualización).
- Realización de pedidos y gestión de los mismos.
- Operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para cada entidad.
- API REST que permite la integración con un frontend.

## Tecnologías utilizadas

- **Java 17**: Lenguaje de programación principal.
- **Spring Boot**: Framework para facilitar la creación del backend.
  - **Spring Data JPA**: Para la gestión de la persistencia de datos.
  - **Spring Security**: Para el manejo de autenticación y autorización de roles.
  - **Lombok**: Para reducir la escritura de código repetitivo.
- **MySQL**: Base de datos relacional para el almacenamiento de datos.
- **Maven**: Para la gestión de dependencias.
- **Postman**: Para probar las peticiones de la API.
  
## Estructura del proyecto

- **src/main/java**: Contiene todas las clases del proyecto, incluidas las entidades, controladores, servicios y repositorios.
- **src/main/resources**: Archivos de configuración como `application.properties`.
- **pom.xml**: Archivo de Maven para la gestión de dependencias.
- **mvnw, mvnw.cmd**: Scripts para ejecutar Maven sin necesidad de instalarlo localmente.

## Cómo ejecutar el proyecto

1. Clona el repositorio:

   ```bash
   git clone https://github.com/tu-usuario/tu-repositorio-backend.git


2.Configura la base de datos MySQL en el archivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/tu_base_de_datos
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

3../mvnw spring-boot:run


## El backend estará corriendo en http://localhost:8080.

API Endpoints
Usuarios: /api/usuarios
Productos: /api/productos
Pedidos: /api/pedidos
Autenticación: /api/auth

## Futuras mejoras

Implementación de autenticación con JWT.
Mejora en la gestión de stock de productos.
Creación de un sistema de facturación.

## Desarrollado por : Cristian Eduardo

