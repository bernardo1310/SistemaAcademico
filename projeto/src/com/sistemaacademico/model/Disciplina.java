package com.sistemaacademico.model;

public class Disciplina {
    private int codigo;
    private String nome;
    private Curso curso;
    private Professor professor;

    public Disciplina(int codigo, String nome, Curso curso, Professor professor) {
        this.codigo = codigo;
        this.nome = nome;
        this.curso = curso;
        this.professor = professor;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public Curso getCurso() { return curso; }
    public void setCurso(Curso curso) { this.curso = curso; }

    public Professor getProfessor() { return professor; }
    public void setProfessor(Professor professor) { this.professor = professor; }
}
