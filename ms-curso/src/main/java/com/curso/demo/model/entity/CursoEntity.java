package com.curso.demo.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_curso")
public class CursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String codigoCurso;
    private String nombre;
    private String ciclo;

    public CursoEntity() {
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getCodigoCurso() { return codigoCurso; }
    public void setCodigoCurso(String codigoCurso) { this.codigoCurso = codigoCurso; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCiclo() { return ciclo; }
    public void setCiclo(String ciclo) { this.ciclo = ciclo; }
}