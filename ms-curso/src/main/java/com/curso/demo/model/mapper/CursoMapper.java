package com.curso.demo.model.mapper;

import com.curso.demo.model.dto.CursoRequest;
import com.curso.demo.model.dto.CursoResponse;
import com.curso.demo.model.entity.CursoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CursoMapper {
    CursoMapper MAPPER = Mappers.getMapper(CursoMapper.class);
    CursoResponse toCursoResponse(CursoEntity entity);
    CursoEntity toCursoEntity(CursoRequest request);
}