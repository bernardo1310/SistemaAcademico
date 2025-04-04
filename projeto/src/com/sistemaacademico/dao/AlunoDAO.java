package com.sistemaacademico.dao;

import com.sistemaacademico.model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionar(Aluno aluno) {
        alunos.add(aluno);
    }

    public Aluno buscarPorCodigo(int codigo) {
        for (Aluno a : alunos) {
            if (a.getCodigo() == codigo) {
                return a;
            }
        }
        return null;
    }

    public List<Aluno> listarTodos() {
        return alunos;
    }

    public void atualizar(Aluno alunoAtualizado) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getCodigo() == alunoAtualizado.getCodigo()) {
                alunos.set(i, alunoAtualizado);
                return;
            }
        }
    }

    public void remover(int codigo) {
        alunos.removeIf(a -> a.getCodigo() == codigo);
    }
}
