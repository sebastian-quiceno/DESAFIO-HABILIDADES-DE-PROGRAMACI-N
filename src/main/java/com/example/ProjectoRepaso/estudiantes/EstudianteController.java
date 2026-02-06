package com.example.ProjectoRepaso.estudiantes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping("/verEstudiantes")
    public List<Estudiante> obtenerEstudiantes(){
        return estudianteService.getEstudiantes();
    }

    // Guardar UN estudiante
    @PostMapping("/crearEstudiante")
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteService.guardarEstudiante(estudiante);
    }

    // Guardar VARIOS estudiantes
    @PostMapping("/crearEstudiantes")
    public List<Estudiante> crearEstudiantes(@RequestBody List<Estudiante> estudiantes) {
        return estudianteService.guardarEstudiantes(estudiantes);
    }
}
