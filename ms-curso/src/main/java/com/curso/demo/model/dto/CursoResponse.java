package com.curso.demo.model.dto;

public class CursoResponse {
    private int id;
    private String codigoCurso;
    private String nombre;
    private String ciclo;

    public CursoResponse() {}

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getCodigoCurso() { return codigoCurso; }
    public void setCodigoCurso(String codigoCurso) { this.codigoCurso = codigoCurso; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCiclo() { return ciclo; }
    public void setCiclo(String ciclo) { this.ciclo = ciclo; }
}