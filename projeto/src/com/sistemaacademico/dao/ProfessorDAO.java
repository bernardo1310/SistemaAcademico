package com.sistemaacademico.dao;

import com.sistemaacademico.model.Professor;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {
    private List<Professor> professores = new ArrayList<>();

    public void adicionar(Professor professor) {
        professores.add(professor);
    }

    public Professor buscarPorId(int id) {
        for (Professor p : professores) {
            if (p.getCodigo() == id) { 
                return p;
            }
        }
        return null;
    }

    public List<Professor> listarTodos() {
        return professores;
    }

    public void atualizar(Professor professorAtualizado) {
        for (int i = 0; i < professores.size(); i++) {
            if (professores.get(i).getCodigo() == professorAtualizado.getCodigo()) {
                professores.set(i, professorAtualizado);
                return;
            }
        }
    }

    public void remover(int id) {
        professores.removeIf(p -> p.getCodigo() == id); 
    }
}
