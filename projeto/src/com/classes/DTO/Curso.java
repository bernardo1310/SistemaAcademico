package com.classes.DTO;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private int codigo;
    private String descricao;  // Adicionando o campo descricao
    private List<Fase> fases;

    public Curso() {
        this.fases = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public List<Fase> getFases() {
        return fases;
    }

    public void adicionarFase(Fase fase) {
        if (!fases.contains(fase)) {
            this.fases.add(fase);
        } else {
            System.out.println("A fase já está no curso");
        }
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso [nome=");
		builder.append(nome);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append(", fases=");
		builder.append(fases);
		builder.append("]");
		return builder.toString();
	}
    
    
    
}
