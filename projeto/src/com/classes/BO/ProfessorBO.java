package com.classes.BO;

import com.classes.DAO.ProfessorDAO;
import com.classes.DTO.Professor;
import java.util.List;

public class ProfessorBO {
    private ProfessorDAO professorDAO;

    public ProfessorBO() {
        this.professorDAO = new ProfessorDAO();
    }

    public boolean inserir(Professor professor) {
        if (professor.getNome() == null || professor.getNome().trim().isEmpty()) {
            return false; // Nome inválido
        }
        return professorDAO.inserir(professor);
    }

    public boolean alterar(Professor professor) {
        if (professor.getCodigo() <= 0 || professor.getNome() == null || professor.getNome().trim().isEmpty()) {
            return false; // Dados inválidos
        }
        return professorDAO.alterar(professor);
    }

    public boolean excluir(Professor professor) {
        if (professor.getCodigo() <= 0) {
            return false; // Código inválido
        }
        return professorDAO.excluir(professor);
    }

    public List<Professor> listarTodos() {
        return professorDAO.listarTodos();
    }
}