package com.sistemaacademico.service;

import com.sistemaacademico.dao.ProfessorDAO;
import com.sistemaacademico.model.Professor;
import java.util.List;

public class ProfessorService {
    private ProfessorDAO professorDAO;

    public ProfessorService() {
        this.professorDAO = new ProfessorDAO();
    }

    public void adicionarProfessor(Professor professor) {
        if (professor.getNome() == null || professor.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome do professor não pode ser vazio.");
        }
        professorDAO.adicionar(professor);
    }

    public Professor buscarProfessor(int codigo) {
        return professorDAO.buscarPorCodigo(codigo); // Agora está chamando o método correto
    }

    public List<Professor> listarProfessores() {
        return professorDAO.listarTodos();
    }

    public void atualizarProfessor(Professor professor) {
        professorDAO.atualizar(professor);
    }

    public void removerProfessor(int codigo) {
        professorDAO.remover(codigo);
    }
}
