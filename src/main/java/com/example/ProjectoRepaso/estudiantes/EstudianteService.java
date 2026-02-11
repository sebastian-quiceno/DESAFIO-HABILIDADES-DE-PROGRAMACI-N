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

        if (estudianteRepository.existsById(estudiante.getId())) {
            throw new RuntimeException("Ya existe un estudiante con ese ID");
        }

        return estudianteRepository.save(estudiante);
    }

    public List<Estudiante> guardarEstudiantes(List<Estudiante> estudiantes) {

        boolean existeIdDuplicado = estudiantes.stream()
                .anyMatch(est -> estudianteRepository.existsById(est.getId()));

        if (existeIdDuplicado) {
            return null;
        }

        return estudianteRepository.saveAll(estudiantes);
    }

    public List<Estudiante> getEstudiantes() {
        return estudianteRepository.findAll();
    }
}

