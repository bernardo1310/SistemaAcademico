package com.sistemaacademico.dto;

public class MatriculaDTO {
    private int codigo;
    private int alunoCodigo;
    private int cursoCodigo;

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

    @Override
    public String toString() {
        return "MatriculaDTO [codigo=" + codigo + ", alunoCodigo=" + alunoCodigo + ", cursoCodigo=" + cursoCodigo + "]";
    }
}
