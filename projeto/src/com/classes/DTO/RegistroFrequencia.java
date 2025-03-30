package com.classes.DTO;

public class RegistroFrequencia {
    private int codigo;               
    private Frequencia frequencia;    // Freq registrada
    private Professor professor;      // Professor que registrou a freq
    private String dataRegistro;      // Data do registro 
    
    public RegistroFrequencia() {
    }

    public RegistroFrequencia(Frequencia frequencia, Professor professor, String dataRegistro) {
        this.frequencia = frequencia;
        this.professor = professor;
        this.dataRegistro = dataRegistro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Frequencia getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Frequencia frequencia) {
        this.frequencia = frequencia;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
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
		builder.append("RegistroFrequencia [codigo=");
		builder.append(codigo);
		builder.append(", frequencia=");
		builder.append(frequencia);
		builder.append(", professor=");
		builder.append(professor);
		builder.append(", dataRegistro=");
		builder.append(dataRegistro);
		builder.append("]");
		return builder.toString();
	}

    
}
