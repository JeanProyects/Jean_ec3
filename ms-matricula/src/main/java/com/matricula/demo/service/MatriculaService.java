package com.matricula.demo.service;

import com.matricula.demo.model.dto.MatriculaRequest;
import com.matricula.demo.model.entity.MatriculaEntity;

public interface MatriculaService {
    void registrarMatricula(MatriculaRequest request);
    Iterable<MatriculaEntity> obtenerHistorico();
}