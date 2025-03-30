package com.classes.DTO;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
	private String nome;
	private int codigo;
	private String descricao;
	private List<Turma> turmas;
    protected List<Professor> professores;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getName() {
		return nome;
	}
	public void setName(String name) {
		this.nome = name;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
    public Disciplina() {
        this.turmas = new ArrayList<>();
    }
    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina [nome=");
		builder.append(nome);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", turmas=");
		builder.append(turmas);
		builder.append("]");
		return builder.toString();
	}

	
	

}
