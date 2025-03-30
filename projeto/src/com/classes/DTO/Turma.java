package com.classes.DTO;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private int codigo;
	private int quantidade;
	private List<Aluno> alunos;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Turma() {
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Turma [codigo=");
		builder.append(codigo);
		builder.append(", quantidade=");
		builder.append(quantidade);
		builder.append(", alunos=");
		builder.append(alunos);
		builder.append("]");
		return builder.toString();
	}
    

}
