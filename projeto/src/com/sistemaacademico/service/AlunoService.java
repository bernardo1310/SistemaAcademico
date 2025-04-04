package com.sistemaacademico.service;

import com.sistemaacademico.dao.AlunoDAO;
import com.sistemaacademico.model.Aluno;
import java.util.List;

public class AlunoService {
    private AlunoDAO alunoDAO;

    public AlunoService() {
        this.alunoDAO = new AlunoDAO();
    }

    public void adicionarAluno(Aluno aluno) {
        if (aluno.getNome() == null || aluno.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome do aluno não pode ser vazio.");
        }
        alunoDAO.adicionar(aluno);
    }

    public Aluno buscarAluno(int codigo) { 
        return alunoDAO.buscarPorCodigo(codigo); 
    }

    public List<Aluno> listarAlunos() {
        return alunoDAO.listarTodos();
    }

    public void atualizarAluno(Aluno aluno) {
        alunoDAO.atualizar(aluno);
    }

    public void removerAluno(int codigo) { 
        alunoDAO.remover(codigo);
    }
}
