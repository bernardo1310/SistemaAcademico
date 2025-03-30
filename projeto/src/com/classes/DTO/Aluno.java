package com.classes.DTO;

import java.util.Objects;

public class Aluno {
    private int codigo;  
    private String nome; 
    private int matricula;  
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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
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
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append(", status=");
		builder.append(status);
		builder.append(", situacao=");
		builder.append(situacao);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", turmaCodigo=");
		builder.append(turmaCodigo);
		builder.append("]");
		return builder.toString();
	}

	// Verificação de Matrícula válida
    public boolean isMatriculaValida() {
        return matricula > 0;
    }

    // Comparação dos objetos Aluno com base na matrícula
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aluno aluno = (Aluno) obj;
        return matricula == aluno.matricula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}
