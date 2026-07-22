package com.matricula.demo.model.dto;

public class MatriculaRequest {
    private String estudiante;
    private String codigoCurso;
    private String cicloElegido;
    private double costoMatricula;

    // Getters y Setters
    public String getEstudiante() { return estudiante; }
    public void setEstudiante(String estudiante) { this.estudiante = estudiante; }
    public String getCodigoCurso() { return codigoCurso; }
    public void setCodigoCurso(String codigoCurso) { this.codigoCurso = codigoCurso; }
    public String getCicloElegido() { return cicloElegido; }
    public void setCicloElegido(String cicloElegido) { this.cicloElegido = cicloElegido; }
    public double getCostoMatricula() { return costoMatricula; }
    public void setCostoMatricula(double costoMatricula) { this.costoMatricula = costoMatricula; }
}