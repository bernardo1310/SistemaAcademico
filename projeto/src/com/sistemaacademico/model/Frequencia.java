package com.sistemaacademico.model;

import java.time.LocalDate;

public class Frequencia {
    private int codigo;
    private Aluno aluno;
    private Disciplina disciplina;
    private LocalDate data;
    private boolean presente;

    public Frequencia(int codigo, Aluno aluno, Disciplina disciplina, LocalDate data, boolean presente) {
        this.codigo = codigo;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.data = data;
        this.presente = presente;
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }

    public Disciplina getDisciplina() { return disciplina; }
    public void setDisciplina(Disciplina disciplina) { this.disciplina = disciplina; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public boolean isPresente() { return presente; }
    public void setPresente(boolean presente) { this.presente = presente; }
}
