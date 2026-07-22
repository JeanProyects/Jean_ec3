package com.curso.demo.controller;

import com.curso.demo.model.dto.CursoRequest;
import com.curso.demo.model.dto.CursoResponse;
import com.curso.demo.service.CursoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/productos") // Mantenemos la ruta base para enganchar con el Feign viejo sin líos
@Tag(name = "API de Cursos", description = "Control de oferta académica para Jean")
public class CursoController {

    private final CursoService service;

    public CursoController(CursoService service) {
        this.service = service;
    }

    @PostMapping("/register")
    @Operation(description = "Abre un nuevo curso en el ciclo actual")
    public void registrar(@RequestBody CursoRequest request) {
        service.registrarCurso(request);
    }

    @GetMapping("/verificar")
    public boolean verificar(@RequestParam("codigo") String codigo, @RequestParam("pasillo") String pasillo) {
        return service.verificarApertura(codigo, pasillo);
    }
}