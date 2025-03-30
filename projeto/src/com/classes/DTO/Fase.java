package com.classes.DTO;
import java.util.ArrayList;
import java.util.List;

public class Fase {
    private int codigo;
    private List<Disciplina> disciplinas;

    public Fase() {
        this.disciplinas = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fase [codigo=");
		builder.append(codigo);
		builder.append(", disciplinas=");
		builder.append(disciplinas);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
