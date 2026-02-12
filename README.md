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

---

#Importante

Para el entorno de pruebas y CI se utiliza la base de datos H2 en memoria, por lo que no es necesario levantar Docker ni una base de datos externa.

  
