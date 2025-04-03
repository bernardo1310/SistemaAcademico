package com.classes.DTO;

import java.util.Objects;

public class Aluno {
    private int codigo;  
    private String nome; 
    private boolean status; 
    private SituacaoAluno situacao;  // Agora com a variável situacao
    private Curso curso; 
    private int turmaCodigo;  

    public Aluno() {
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public SituacaoAluno getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoAluno situacao) {
        this.situacao = situacao;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getTurmaCodigo() {
        return turmaCodigo;
    }

    public void setTurmaCodigo(int turmaCodigo) {
        this.turmaCodigo = turmaCodigo;
    }

    @Override
    public String toString() {
        return "Aluno [codigo=" + codigo + ", nome=" + nome + ", status=" + status + ", situacao=" + situacao
                + ", curso=" + curso + ", turmaCodigo=" + turmaCodigo + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aluno aluno = (Aluno) obj;
        return codigo == aluno.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
