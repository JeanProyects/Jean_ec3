package com.curso.demo.service;

import com.curso.demo.model.dto.CursoRequest;
import com.curso.demo.model.dto.CursoResponse;

public interface CursoService {
    void registrarCurso(CursoRequest request);
    Iterable<CursoResponse> obtenerCursos();
    boolean verificarApertura(String codigoCurso, String ciclo);
}