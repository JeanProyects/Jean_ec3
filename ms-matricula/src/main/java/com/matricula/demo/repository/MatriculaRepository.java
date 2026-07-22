package com.matricula.demo.repository;

import com.matricula.demo.model.entity.MatriculaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends CrudRepository<MatriculaEntity, Integer> {
}