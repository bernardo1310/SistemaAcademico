package com.sistemaacademico.dto;

public class DisciplinaDTO {
    private int codigo;
    private String nome;
    private String cargaHoraria;
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
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		return "DisciplinaDTO [codigo=" + codigo + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + "]";
	}
}
