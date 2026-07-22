package com.matricula.demo.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_matricula")
public class MatriculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String estudiante;
    private String codigoCurso;
    private String cicloElegido;
    private double costoMatricula;

    public MatriculaEntity() {
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getEstudiante() { return estudiante; }
    public void setEstudiante(String estudiante) { this.estudiante = estudiante; }
    public String getCodigoCurso() { return codigoCurso; }
    public void setCodigoCurso(String codigoCurso) { this.codigoCurso = codigoCurso; }
    public String getCicloElegido() { return cicloElegido; }
    public void setCicloElegido(String cicloElegido) { this.cicloElegido = cicloElegido; }
    public double getCostoMatricula() { return costoMatricula; }
    public void setCostoMatricula(double costoMatricula) { this.costoMatricula = costoMatricula; }
}