package com.curso.demo.controller;

import com.curso.demo.model.dto.CursoRequest;
import com.curso.demo.model.dto.CursoResponse;
import com.curso.demo.service.CursoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/cursos")
@Tag(
        name = "API de Cursos",
        description = "Gestión de cursos y oferta académica"
)
public class CursoController {

    private final CursoService service;

    public CursoController(CursoService service) {
        this.service = service;
    }

    @PostMapping("/register")
    @Operation(description = "Registra un curso disponible en un ciclo académico")
    public void registrar(@RequestBody CursoRequest request) {
        service.registrarCurso(request);
    }

    @GetMapping
    @Operation(description = "Lista todos los cursos registrados")
    public Iterable<CursoResponse> obtenerCursos() {
        return service.obtenerCursos();
    }

    @GetMapping("/verificar")
    @Operation(description = "Verifica si un curso está disponible en un ciclo")
    public boolean verificar(
            @RequestParam("codigoCurso") String codigoCurso,
            @RequestParam("ciclo") String ciclo
    ) {
        return service.verificarApertura(codigoCurso, ciclo);
    }
}