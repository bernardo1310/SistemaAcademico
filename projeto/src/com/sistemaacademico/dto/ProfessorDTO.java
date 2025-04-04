package com.sistemaacademico.dto;

public class ProfessorDTO {
    private int codigo;
    private String nome;
    private String cpf;
    private String email;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "ProfessorDTO [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + "]";
	}
    
}
