package com.curso.demo.repository;

import com.curso.demo.model.entity.CursoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface CursoRepository extends CrudRepository<CursoEntity, Integer> {
    Optional<CursoEntity> findByCodigoCursoAndCiclo(String codigoCurso, String ciclo);
}