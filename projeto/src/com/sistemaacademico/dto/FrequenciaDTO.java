package com.sistemaacademico.dto;

public class FrequenciaDTO {
    private int codigo;
    private int alunoCodigo;
    private int disciplinaCodigo;
    private boolean presente;
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
	public boolean isPresente() {
		return presente;
	}
	public void setPresente(boolean presente) {
		this.presente = presente;
	}

}
