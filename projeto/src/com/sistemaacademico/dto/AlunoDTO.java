package com.sistemaacademico.dto;

import java.util.List;

public class AlunoDTO {
    private int codigo;
    private String nome;
    private List<MatriculaDTO> matriculas;

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

    public List<MatriculaDTO> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<MatriculaDTO> matriculas) {
        this.matriculas = matriculas;
    }

    @Override
    public String toString() {
        return "AlunoDTO [codigo=" + codigo + ", nome=" + nome + ", matriculas=" + matriculas + "]";
    }
}
