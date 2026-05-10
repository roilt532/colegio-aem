package com.aem.colegio.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.aem.colegio.modelo.Alumno;
import com.aem.colegio.modelo.Asignatura;
import com.aem.colegio.repositorio.AlumnoRepositorio;
import com.aem.colegio.repositorio.AsignaturaRepositorio;

// Controlador principal: maneja todas las rutas de la web
@Controller
public class ColegioControlador {

    // Inyeccion de los repositorios para acceder a la BBDD
    @Autowired
    private AlumnoRepositorio alumnoRepo;

    @Autowired
    private AsignaturaRepositorio asignaturaRepo;


    // 1) GET /inicio - pagina principal

    @GetMapping("/inicio")
    public String inicio() {
        // Devuelve la plantilla "inicio.html"
        return "inicio";
    }

    // Redirige la raiz "/" hacia "/inicio" para que sea mas comodo
    @GetMapping("/")
    public String raiz() {
        return "redirect:/inicio";
    }


    // 2) GET /listadoAlumnos - tabla con todos los alumnos

    @GetMapping("/listadoAlumnos")
    public String listadoAlumnos(Model model) {
        // Recupera todos los alumnos de la BBDD
        model.addAttribute("alumnos", alumnoRepo.findAll());
        return "listadoAlumnos";
    }

 
    // 3) GET /listadoAsignaturas - tabla con todas las asignaturas

    @GetMapping("/listadoAsignaturas")
    public String listadoAsignaturas(Model model) {
        model.addAttribute("asignaturas", asignaturaRepo.findAll());
        return "listadoAsignaturas";
    }


    // 4) GET/POST /altaAlumnos - formulario y guardado de alumnos
 

    // GET: muestra el formulario vacio
    @GetMapping("/altaAlumnos")
    public String mostrarFormularioAlumno(Model model) {
        // Pasa un objeto Alumno vacio al formulario
        model.addAttribute("alumno", new Alumno());
        return "altaAlumnos";
    }

    // POST: recibe los datos del formulario y los guarda en la BBDD
    @PostMapping("/altaAlumnos")
    public String guardarAlumno(@ModelAttribute Alumno alumno) {
        // save() inserta el alumno en la tabla "alumnos"
        alumnoRepo.save(alumno);
        // Tras guardar, redirige al listado para ver el resultado
        return "redirect:/listadoAlumnos";
    }

    // 5) GET/POST /altaAsignaturas - formulario y guardado de asignaturas


    @GetMapping("/altaAsignaturas")
    public String mostrarFormularioAsignatura(Model model) {
        model.addAttribute("asignatura", new Asignatura());
        return "altaAsignaturas";
    }

    @PostMapping("/altaAsignaturas")
    public String guardarAsignatura(@ModelAttribute Asignatura asignatura) {
        asignaturaRepo.save(asignatura);
        return "redirect:/listadoAsignaturas";
    }
}