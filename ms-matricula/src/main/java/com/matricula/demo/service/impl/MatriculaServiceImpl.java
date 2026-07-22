package com.matricula.demo.service.impl;

import com.matricula.demo.client.CursoClient;
import com.matricula.demo.model.dto.MatriculaRequest;
import com.matricula.demo.model.entity.MatriculaEntity;
import com.matricula.demo.repository.MatriculaRepository;
import com.matricula.demo.service.MatriculaService;
import org.springframework.stereotype.Service;

@Service
public class MatriculaServiceImpl implements MatriculaService {

    private final MatriculaRepository repository;
    private final CursoClient cursoClient;

    public MatriculaServiceImpl(MatriculaRepository repository, CursoClient cursoClient) {
        this.repository = repository;
        this.cursoClient = cursoClient;
    }

    @Override
    public void registrarMatricula(MatriculaRequest dto) {
        boolean cursoValido = cursoClient.verificar(dto.getCodigoCurso(), dto.getCicloElegido());

        if (!cursoValido) {
            throw new RuntimeException("Error: El curso ingresado no pertenece al ciclo seleccionado o no está aperturado.");
        }

        MatriculaEntity entity = new MatriculaEntity();
        entity.setEstudiante(dto.getEstudiante());
        entity.setCodigoCurso(dto.getCodigoCurso());
        entity.setCicloElegido(dto.getCicloElegido());
        entity.setCostoMatricula(dto.getCostoMatricula());

        repository.save(entity);
    }

    @Override
    public Iterable<MatriculaEntity> obtenerHistorico() {
        return repository.findAll();
    }
}