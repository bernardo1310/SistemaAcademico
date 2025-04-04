package com.sistemaacademico.model;

public class Avaliacao {
    private int codigo;
    private Aluno aluno;
    private Disciplina disciplina;
    private double nota;

    public Avaliacao(int codigo, Aluno aluno, Disciplina disciplina, double nota) {
        this.codigo = codigo;
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public int getCodigo() { 
        return codigo; 
    }

    public void setCodigo(int codigo) { 
        this.codigo = codigo; 
    }

    public Aluno getAluno() { 
        return aluno; 
    }

    public void setAluno(Aluno aluno) { 
        this.aluno = aluno; 
    }

    public Disciplina getDisciplina() { 
        return disciplina; 
    }

    public void setDisciplina(Disciplina disciplina) { 
        this.disciplina = disciplina; 
    }

    public double getNota() { 
        return nota; 
    }

    public void setNota(double nota) { 
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
        this.nota = nota; 
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
               "codigo=" + codigo +
               ", aluno=" + aluno.getNome() +
               ", disciplina=" + disciplina.getNome() +
               ", nota=" + nota +
               '}';
    }
}
