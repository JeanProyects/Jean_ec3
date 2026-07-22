package com.matricula.demo.controller;

import com.matricula.demo.model.dto.MatriculaRequest;
import com.matricula.demo.model.entity.MatriculaEntity;
import com.matricula.demo.service.MatriculaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/reservas")
@Tag(name = "API de Matrículas", description = "Gestión de inscripciones académicas para Jean")
public class MatriculaController {

    private final MatriculaService service;

    public MatriculaController(MatriculaService service) {
        this.service = service;
    }

    @PostMapping("/register")
    @Operation(description = "Registra una matrícula validando la existencia del curso externamente")
    public void register(@RequestBody MatriculaRequest request) {
        service.registrarMatricula(request);
    }

    @GetMapping
    public Iterable<MatriculaEntity> reservas() {
        return service.obtenerHistorico();
    }
}