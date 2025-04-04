package com.sistemaacademico.model;

public class Matricula {
    private int codigo;
    private int alunoCodigo;
    private int cursoCodigo;

    // Construtor padrão
    public Matricula() {
    }

    // Construtor com parâmetros
    public Matricula(int codigo, int alunoCodigo, int cursoCodigo) {
        this.codigo = codigo;
        this.alunoCodigo = alunoCodigo;
        this.cursoCodigo = cursoCodigo;
    }

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

    public int getCursoCodigo() {
        return cursoCodigo;
    }

    public void setCursoCodigo(int cursoCodigo) {
        this.cursoCodigo = cursoCodigo;
    }
}
