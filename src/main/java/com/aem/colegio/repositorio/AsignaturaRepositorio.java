package com.aem.colegio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aem.colegio.modelo.Asignatura;

// Repositorio JPA para la entidad Asignatura
public interface AsignaturaRepositorio extends JpaRepository<Asignatura, Long> {

}