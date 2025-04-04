package com.sistemaacademico.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int codigo;
    private String nome;
    private List<Disciplina> disciplinas;

    public Curso(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
    }

    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public List<Disciplina> getDisciplinas() { return disciplinas; }
    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

	public String getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDescricao(String descricao) {
		// TODO Auto-generated method stub
		
	}
}
