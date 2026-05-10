package com.aem.colegio.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.aem.colegio.modelo.Alumno;
import com.aem.colegio.modelo.Asignatura;
import com.aem.colegio.repositorio.AlumnoRepositorio;
import com.aem.colegio.repositorio.AsignaturaRepositorio;

// @Component detectar para ejecutar la clase cuando empieza
@Component
public class CargaDatosInicial implements CommandLineRunner {

    // Inyeccion de los repositorios
    private final AlumnoRepositorio alumnoRepo;
    private final AsignaturaRepositorio asignaturaRepo;


    public CargaDatosInicial(AlumnoRepositorio alumnoRepo, AsignaturaRepositorio asignaturaRepo) {
        this.alumnoRepo = alumnoRepo;
        this.asignaturaRepo = asignaturaRepo;
    }

    // Este metodo se ejecuta al arrancar la app
    @Override
    public void run(String... args) throws Exception {

        // Cargar 10 alumnos solo si la tabla esta vacia
 
        if (alumnoRepo.count() == 0) {
            alumnoRepo.save(new Alumno("Lucia", "Garcia Perez", "1 DAW", 8.5, "lucia.garcia@colegio.com"));
            alumnoRepo.save(new Alumno("Mario", "Lopez Ruiz", "1 DAW", 7.2, "mario.lopez@colegio.com"));
            alumnoRepo.save(new Alumno("Sara", "Martinez Sanz", "1 DAW", 9.1, "sara.martinez@colegio.com"));
            alumnoRepo.save(new Alumno("Diego", "Fernandez Diaz", "1 DAW", 6.5, "diego.fernandez@colegio.com"));
            alumnoRepo.save(new Alumno("Carla", "Rodriguez Gil", "2 DAW", 8.8, "carla.rodriguez@colegio.com"));
            alumnoRepo.save(new Alumno("Pablo", "Sanchez Vega", "2 DAW", 7.7, "pablo.sanchez@colegio.com"));
            alumnoRepo.save(new Alumno("Elena", "Jimenez Soto", "2 DAW", 9.5, "elena.jimenez@colegio.com"));
            alumnoRepo.save(new Alumno("Hugo", "Moreno Romero", "1 DAM", 6.8, "hugo.moreno@colegio.com"));
            alumnoRepo.save(new Alumno("Marta", "Alvarez Castro", "1 DAM", 8.3, "marta.alvarez@colegio.com"));
            alumnoRepo.save(new Alumno("Javier", "Torres Ortiz", "2 DAM", 7.9, "javier.torres@colegio.com"));

            System.out.println(">>> 10 alumnos cargados en la BBDD");
        }

        // Cargar 10 asignaturas solo si la tabla esta vacia

        if (asignaturaRepo.count() == 0) {
            asignaturaRepo.save(new Asignatura("Programacion", "1 DAW", "Juan Antonio Garcia", 8, 12));
            asignaturaRepo.save(new Asignatura("Bases de Datos", "1 DAW", "Maria Lopez", 6, 10));
            asignaturaRepo.save(new Asignatura("Lenguajes de Marcas", "1 DAW", "Carlos Ruiz", 4, 7));
            asignaturaRepo.save(new Asignatura("Entornos de Desarrollo", "1 DAW", "Ana Martinez", 3, 5));
            asignaturaRepo.save(new Asignatura("Sistemas Informaticos", "1 DAW", "Pedro Sanchez", 5, 8));
            asignaturaRepo.save(new Asignatura("Desarrollo Web Cliente", "2 DAW", "Laura Diaz", 8, 12));
            asignaturaRepo.save(new Asignatura("Desarrollo Web Servidor", "2 DAW", "Juan Antonio Garcia", 8, 12));
            asignaturaRepo.save(new Asignatura("Despliegue de Aplicaciones", "2 DAW", "Sergio Romero", 4, 6));
            asignaturaRepo.save(new Asignatura("Diseno de Interfaces", "2 DAW", "Cristina Vega", 6, 9));
            asignaturaRepo.save(new Asignatura("Ingles Tecnico", "2 DAW", "Sarah Johnson", 2, 4));

            System.out.println(">>> 10 asignaturas cargadas en la BBDD");
        }
    }
}