package com.example.ProjectoRepaso.estudiantes;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    private final EstudianteRepository estudianteRepository;

    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public List<Estudiante> guardarEstudiantes(List<Estudiante> estudiantes) {
        return estudianteRepository.saveAll(estudiantes);
    }

    public List<Estudiante> getEstudiantes() {
        return estudianteRepository.findAll();
    }
}

