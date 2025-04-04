package com.sistemaacademico.model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private int codigo;
    private String nome;
    private List<Matricula> matriculas;

    public Aluno(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.matriculas = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void adicionarMatricula(Matricula matricula) {
        this.matriculas.add(matricula);
    }
}
