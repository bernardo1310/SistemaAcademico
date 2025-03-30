package com.classes.DTO;

public class RegistroAvaliacao {
    private int codigo;          // Código do registro
    private Professor professor; // Professor que registrou a avaliação
    private Avaliacao avaliacao; // A avaliação registrada (relacionada ao aluno)
    private String dataRegistro; // Data de quando o professor registrou a avaliação

    public RegistroAvaliacao() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegistroAvaliacao [codigo=");
		builder.append(codigo);
		builder.append(", professor=");
		builder.append(professor);
		builder.append(", avaliacao=");
		builder.append(avaliacao);
		builder.append(", dataRegistro=");
		builder.append(dataRegistro);
		builder.append("]");
		return builder.toString();
	}

    
}
