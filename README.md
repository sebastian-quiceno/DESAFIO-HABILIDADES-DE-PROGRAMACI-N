# Proyecto Repaso – Spring Boot

Este proyecto es una aplicación backend desarrollada con **Spring Boot** como parte de un ejercicio práctico para reforzar conocimientos en desarrollo backend, control de versiones y automatización con **CI/CD** usando **GitHub Actions**.

---

## Instrucciones de Ejecución

### Requisitos previos
- Java JDK 21
- Maven
- Git

---

### Ejecución en entorno local

1. Clonar el repositorio:
```bash
git clone <URL_DEL_REPOSITORIO>
cd ProjectoRepaso
```
2. Conexion con la base de datos:
El programa necesita una conexion a una base de datos PostgreSQL, la cual esta se hace en: **localhost:5432/demo_db**

3. Compilar el proyecto:
```bash
mvn clean package
```

4. Ejecutar la aplicación:
```bash
mvn spring-boot:run
```
La aplicación se levantará por defecto en: **http://localhost:8080**

### Importante

Para el entorno de pruebas y CI se utiliza la base de datos H2 en memoria, por lo que no es necesario levantar Docker ni una base de datos externa.

---

# Estrategia de Gestión de Versiones (GitFlow)

Para este proyecto se eligió la estrategia GitFlow, utilizando principalmente las ramas:

- main: rama de producción, contiene versiones estables del proyecto.

- develop: rama de desarrollo, donde se integran las nuevas funcionalidades antes de pasar a producción.

Se eligió GitFlow porque:

- Permite una separación clara entre desarrollo y producción.

- Facilita el trabajo colaborativo.

- Reduce el riesgo de introducir errores en la rama principal.

- Es una estrategia ampliamente usada en entornos reales de desarrollo.

---

# Herramientas utilizadas en el Pipeline

## GitHub Actions
Plataforma de automatización que permite ejecutar flujos de trabajo ante eventos como push o pull request.

## Java JDK 21 (Temurin)
Entorno de ejecución utilizado para compilar y ejecutar el proyecto.

## Maven
Herramienta de gestión de dependencias y construcción del proyecto.

## Spring Boot Test + H2
Se utiliza H2 en memoria para ejecutar pruebas sin depender de una base de datos externa.
