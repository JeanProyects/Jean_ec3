package com.matricula.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        name = "CursoClient",
        url = "${CURSO_URL:http://localhost:8083/v1/cursos}"
)
public interface CursoClient {

    @GetMapping("/verificar")
    boolean verificar(
            @RequestParam("codigoCurso") String codigoCurso,
            @RequestParam("ciclo") String ciclo
    );
}