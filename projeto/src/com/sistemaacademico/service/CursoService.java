package com.sistemaacademico.service;

import com.sistemaacademico.dao.CursoDAO;
import com.sistemaacademico.model.Curso;
import java.util.List;

public class CursoService {
    private CursoDAO cursoDAO;

    public CursoService() {
        this.cursoDAO = new CursoDAO();
    }

    public void adicionarCurso(Curso curso) {
        if (curso.getNome() == null || curso.getNome().isEmpty()) {
            throw new IllegalArgumentException("O nome do curso não pode ser vazio.");
        }
        cursoDAO.adicionar(curso);
    }

    public Curso buscarCurso(int codigo) {
        return cursoDAO.buscarPorCodigo(codigo);
    }

    public List<Curso> listarCursos() {
        return cursoDAO.listarTodos();
    }

    public void atualizarCurso(Curso curso) {
        cursoDAO.atualizar(curso);
    }

    public void removerCurso(int codigo) {
        cursoDAO.remover(codigo);
    }
}
