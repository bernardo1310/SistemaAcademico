package com.classes.BO;

import com.classes.DAO.CursoDAO;
import com.classes.DTO.Curso;
import java.util.List;

public class CursoBO {
    private CursoDAO cursoDAO;

    public CursoBO() {
        this.cursoDAO = new CursoDAO();
    }

    public boolean inserir(Curso curso) {
        if (curso.getNome() == null || curso.getNome().trim().isEmpty()) {
            System.out.println("Nome do curso não pode ser vazio.");
            return false;
        }
        return cursoDAO.inserir(curso);
    }

    public boolean alterar(Curso curso) {
        if (curso.getCodigo() <= 0) {
            System.out.println("Código do curso inválido.");
            return false;
        }
        return cursoDAO.alterar(curso);
    }

    public boolean excluir(Curso curso) {
        if (curso.getCodigo() <= 0) {
            System.out.println("Código do curso inválido.");
            return false;
        }
        return cursoDAO.excluir(curso);
    }

    public List<Curso> listarTodos() {
        return cursoDAO.listarTodos();
    }
}