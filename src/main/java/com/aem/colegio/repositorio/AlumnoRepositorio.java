package com.aem.colegio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aem.colegio.modelo.Alumno;

// Repositorio JPA para la entidad Alumno
// JpaRepository nos da gratis: findAll(), findById() save() y demas
public interface AlumnoRepositorio extends JpaRepository<Alumno, Long> {

}