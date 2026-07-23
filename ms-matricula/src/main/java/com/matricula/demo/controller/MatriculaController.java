package com.matricula.demo.controller;

import com.matricula.demo.model.dto.MatriculaRequest;
import com.matricula.demo.model.entity.MatriculaEntity;
import com.matricula.demo.service.MatriculaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/matriculas")
@Tag(
        name = "API de Matrículas",
        description = "Gestión de inscripciones académicas"
)
public class MatriculaController {

    private final MatriculaService service;

    public MatriculaController(MatriculaService service) {
        this.service = service;
    }

    @PostMapping("/register")
    @Operation(description = "Registra una matrícula validando el curso y ciclo")
    public void registrar(@RequestBody MatriculaRequest request) {
        service.registrarMatricula(request);
    }

    @GetMapping
    @Operation(description = "Lista el historial de matrículas")
    public Iterable<MatriculaEntity> obtenerMatriculas() {
        return service.obtenerHistorico();
    }
}