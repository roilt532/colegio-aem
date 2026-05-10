

-- Proyecto: Colegio - Alumnos y Asignaturas
-- Autor: AEM


-- Elimina la BBDD si ya existe
DROP DATABASE IF EXISTS colegio_aem;

-- Crea la BBDD con codificacion UTF-8
CREATE DATABASE colegio_aem
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;

-- Selecciona la BBDD
USE colegio_aem;


-- user con permisos de escritura

DROP USER IF EXISTS 'aem_user'@'localhost';

CREATE USER 'aem_user'@'localhost' IDENTIFIED BY 'aem1234';

GRANT ALL PRIVILEGES ON colegio_aem.* TO 'aem_user'@'localhost';

FLUSH PRIVILEGES;


-- Las tablas (alumnos, asignaturas) las crea automaticamente
-- Hibernate al arrancar la aplicacion gracias a la propiedad:
--   spring.jpa.hibernate.ddl-auto=update
--
-- Los 10 registros iniciales de cada entidad los inserta
-- la clase CargaDatosInicial (CommandLineRunner) en el arranque.
