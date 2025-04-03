	package com.classes.DTO;
	
	import java.util.ArrayList;
	import java.util.List;
	
	public class Turma {
	    private int codigo;
	    private String nome; // Alterado para 'nome' (não 'descricao' mais)
	    private int cursoCodigo; // Adicionado o código do curso (para o relacionamento)
	    private List<Aluno> alunos;
	
	    // Getters e Setters
	    public List<Aluno> getAlunos() {
	        return alunos;
	    }
	
	    public void setAlunos(List<Aluno> alunos) {
	        this.alunos = alunos;
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
	
	    public int getCursoCodigo() {
	        return cursoCodigo;
	    }
	
	    public void setCursoCodigo(int cursoCodigo) {
	        this.cursoCodigo = cursoCodigo;
	    }
	
	    public Turma() {
	        this.alunos = new ArrayList<>();
	    }
	
	    public void adicionarAluno(Aluno aluno) {
	        this.alunos.add(aluno);
	    }
	
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Turma [codigo=");
			builder.append(codigo);
			builder.append(", nome=");
			builder.append(nome);
			builder.append(", cursoCodigo=");
			builder.append(cursoCodigo);
			builder.append(", alunos=");
			builder.append(alunos);
			builder.append("]");
			return builder.toString();
		}
	
	    
	}
