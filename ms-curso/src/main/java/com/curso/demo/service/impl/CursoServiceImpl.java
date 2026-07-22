package com.curso.demo.service.impl;

import com.curso.demo.model.dto.CursoRequest;
import com.curso.demo.model.dto.CursoResponse;
import com.curso.demo.model.mapper.CursoMapper;
import com.curso.demo.repository.CursoRepository;
import com.curso.demo.service.CursoService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class CursoServiceImpl implements CursoService {

    private final CursoRepository repository;

    public CursoServiceImpl(CursoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void registrarCurso(CursoRequest request) {
        var entity = CursoMapper.MAPPER.toCursoEntity(request);
        repository.save(entity);
    }

    @Override
    public Iterable<CursoResponse> obtenerCursos() {
        var cursos = repository.findAll();
        var lista = new ArrayList<CursoResponse>();
        cursos.forEach(x -> lista.add(CursoMapper.MAPPER.toCursoResponse(x)));
        return lista;
    }

    @Override
    public boolean verificarApertura(String codigoCurso, String ciclo) {
        return repository.findByCodigoCursoAndCiclo(codigoCurso, ciclo).isPresent();
    }
}