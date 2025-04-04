package com.sistemaacademico.dao;

import com.sistemaacademico.model.Curso;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO {
    private List<Curso> cursos = new ArrayList<>();

    public void adicionar(Curso curso) {
        cursos.add(curso);
    }

    public Curso buscarPorCodigo(int codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo() == codigo) {
                return c;
            }
        }
        return null;
    }

    public List<Curso> listarTodos() {
        return cursos;
    }

    public void atualizar(Curso cursoAtualizado) {
        for (int i = 0; i < cursos.size(); i++) {
            if (cursos.get(i).getCodigo() == cursoAtualizado.getCodigo()) {
                cursos.set(i, cursoAtualizado);
                return;
            }
        }
    }

    public void remover(int codigo) {
        cursos.removeIf(c -> c.getCodigo() == codigo);
    }
}
