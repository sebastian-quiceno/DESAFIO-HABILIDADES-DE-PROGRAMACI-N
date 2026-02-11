package com.example.ProjectoRepaso.estudiantes;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Estudiante>> obtenerEstudiantes() {
        List<Estudiante> estudiantes = estudianteService.getEstudiantes();
        return ResponseEntity.ok(estudiantes); // 200
    }
    // Guardar UN estudiante
    @PostMapping("/crearEstudiante")
    public ResponseEntity<Estudiante> crearEstudiante(@RequestBody Estudiante estudiante) {
        Estudiante guardado = estudianteService.guardarEstudiante(estudiante);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(guardado); // 201
    }

    // Guardar VARIOS estudiantes
    @PostMapping("/crearEstudiantes")
    public ResponseEntity<List<Estudiante>> crearEstudiantes(
            @RequestBody List<Estudiante> estudiantes) {

        List<Estudiante> guardados = estudianteService.guardarEstudiantes(estudiantes);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(guardados); // 201
    }
}
//Prueba de CI
