package com.sistemaacademico.dto;

public class SituacaoAlunoDTO {
    private int alunoCodigo;
    private String situacao;
	public int getAlunoCodigo() {
		return alunoCodigo;
	}
	public void setAlunoCodigo(int alunoCodigo) {
		this.alunoCodigo = alunoCodigo;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	@Override
	public String toString() {
		return "SituacaoAlunoDTO [alunoCodigo=" + alunoCodigo + ", situacao=" + situacao + "]";
	}
    
}
