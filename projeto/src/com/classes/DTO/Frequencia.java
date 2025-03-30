package com.classes.DTO;

public class Frequencia {
    private int codigo;               // ID do registro de frequência
    private Aluno aluno;          // Aluno que está sendo registrado
    private String aula;          // Aula relacionada à frequência
    private String data;          // Data da frequência
    private String presente;      // Status de presença (Sim/Não)

    public Frequencia() {
    }

    public Frequencia(Aluno aluno, String aula, String data, String presente) {
        this.aluno = aluno;
        this.aula = aula;
        this.data = data;
        this.presente = presente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setId(int codigo) {
        this.codigo = codigo;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPresente() {
        return presente;
    }

    public void setPresente(String presente) {
        this.presente = presente;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Frequencia [codigo=");
		builder.append(codigo);
		builder.append(", aluno=");
		builder.append(aluno);
		builder.append(", aula=");
		builder.append(aula);
		builder.append(", data=");
		builder.append(data);
		builder.append(", presente=");
		builder.append(presente);
		builder.append("]");
		return builder.toString();
	}

    
}
