package com.classes.DTO;

public class Avaliacao {
    private int codigo;         // Código da avaliação (identificador único)
    private double nota;        // Nota do aluno
    private String data;        // Data da avaliação

    public Avaliacao() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
    	if (nota >= 0 && nota <= 10) { 
            this.nota = nota;
        } else {
            System.out.println("Nota inválida!");
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Avaliacao [codigo=" + codigo + ", nota=" + nota + ", data=" + data + "]";
    }
}
