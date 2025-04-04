package com.sistemaacademico.dao;

import com.sistemaacademico.model.Disciplina;
import java.util.ArrayList;
import java.util.List;

public class DisciplinaDAO {
    private List<Disciplina> disciplinas = new ArrayList<>();

    public void adicionar(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public Disciplina buscarPorCodigo(int codigo) {
        for (Disciplina d : disciplinas) {
            if (d.getCodigo() == codigo) {
                return d;
            }
        }
        return null;
    }

    public List<Disciplina> listarTodas() {
        return disciplinas;
    }

    public void atualizar(Disciplina disciplinaAtualizada) {
        for (int i = 0; i < disciplinas.size(); i++) {
            if (disciplinas.get(i).getCodigo() == disciplinaAtualizada.getCodigo()) {
                disciplinas.set(i, disciplinaAtualizada);
                return;
            }
        }
    }

    public void remover(int codigo) {
        disciplinas.removeIf(d -> d.getCodigo() == codigo);
    }
}
