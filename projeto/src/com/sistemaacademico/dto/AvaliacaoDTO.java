package com.sistemaacademico.dto;

public class AvaliacaoDTO {
    private int codigo;
    private int alunoCodigo;
    private int disciplinaCodigo;
    private double nota;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getAlunoCodigo() {
		return alunoCodigo;
	}
	public void setAlunoCodigo(int alunoCodigo) {
		this.alunoCodigo = alunoCodigo;
	}
	public int getDisciplinaCodigo() {
		return disciplinaCodigo;
	}
	public void setDisciplinaCodigo(int disciplinaCodigo) {
		this.disciplinaCodigo = disciplinaCodigo;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "AvaliacaoDTO [codigo=" + codigo + ", alunoCodigo=" + alunoCodigo + ", disciplinaCodigo="
				+ disciplinaCodigo + ", nota=" + nota + "]";
	}
    
}
