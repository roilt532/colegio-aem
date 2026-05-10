# 🎓 Colegio AEM - Práctica UT8

Aplicación web para la gestión de **alumnos** y **asignaturas** de un colegio, desarrollada como práctica de la unidad UT8 (JPA/Hibernate) del módulo de Programación del CFGS DAW.

## 📋 Descripción del proyecto

Aplicación web tipo CRUD básico que permite:

- Listar todos los alumnos registrados
- Listar todas las asignaturas registradas
- Dar de alta nuevos alumnos
- Dar de alta nuevas asignaturas
- Página de error personalizada

Al arrancar la aplicación se cargan automáticamente **10 alumnos** y **10 asignaturas** de prueba en la base de datos.

## 🛠 Tecnologías utilizadas

- **Java 17**
- **Spring Boot 3.5.x**
- **Spring Data JPA / Hibernate**
- **Thymeleaf** (motor de plantillas)
- **MySQL / MariaDB**
- **Bootstrap 5** (diseño responsive)
- **Maven**

## 📦 Requisitos previos

- Java 17 (JDK)
- Maven 3.6+
- MySQL o MariaDB en ejecución (local: XAMPP)
- Git

## 🚀 Cómo ejecutar el proyecto en local

### 1. Clonar el repositorio

```bash
git clone https://github.com/TU_USUARIO/colegio-aem.git
cd colegio-aem
```

### 2. Crear la base de datos

Abre MySQL Workbench (o cualquier cliente MySQL) y ejecuta el script `schema.sql` que está en la raíz del proyecto. Esto creará:

- La base de datos `colegio_aem`
- El usuario `aem_user` con contraseña `aem1234` y permisos sobre la BBDD

### 3. Configurar `application.properties`

Por defecto el archivo ya está configurado para entorno local. Si tu MySQL usa otro puerto o credenciales diferentes, ajústalo en `src/main/resources/application.properties`.

### 4. Ejecutar la aplicación

```bash
mvn spring-boot:run
```

O desde Spring Tools / Eclipse: click derecho en el proyecto → Run As → Spring Boot App.

### 5. Acceder a la aplicación

Abre en el navegador: [http://localhost:8080/inicio](http://localhost:8080/inicio)

## 🌐 Despliegue en Railway

La aplicación está desplegada en Railway. Puedes acceder a la versión online aquí:

🔗 **[URL_DE_RAILWAY_PENDIENTE]**

> *(Esta URL se actualizará cuando el despliegue esté listo)*

## 🗺 Endpoints disponibles

| Método | Ruta | Descripción |
|--------|------|-------------|
| GET | `/inicio` | Página principal con avatar y enlaces |
| GET | `/listadoAlumnos` | Tabla con todos los alumnos |
| GET | `/listadoAsignaturas` | Tabla con todas las asignaturas |
| GET | `/altaAlumnos` | Formulario de alta de alumno |
| POST | `/altaAlumnos` | Guarda un nuevo alumno |
| GET | `/altaAsignaturas` | Formulario de alta de asignatura |
| POST | `/altaAsignaturas` | Guarda una nueva asignatura |

## 🗄 Estructura de las entidades

### Alumno

| Campo | Tipo |
|-------|------|
| id | Long (autoincremental) |
| nombre | String |
| apellidos | String |
| curso | String |
| notaMedia | Double |
| email | String |

### Asignatura

| Campo | Tipo |
|-------|------|
| id | Long (autoincremental) |
| nombre | String |
| curso | String |
| tutor | String |
| horasSemanales | Integer |
| creditos | Integer |

## 📸 Capturas de pantalla

### Página de inicio
*(Pega aquí captura de /inicio)*

### Listado de alumnos
*(Pega aquí captura de /listadoAlumnos)*

### Formulario de alta
*(Pega aquí captura de /altaAlumnos)*

### Página de error personalizada
*(Pega aquí captura de la página de error)*

## 👤 Autor

**AEM** - Práctica UT8 - CFGS DAW

Profesor: Juan Antonio García