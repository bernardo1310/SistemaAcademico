package com.sistemaacademico.dao;

import com.sistemaacademico.model.Matricula;
import java.util.ArrayList;
import java.util.List;

public class MatriculaDAO {
    private List<Matricula> matriculas = new ArrayList<>();

    public void adicionar(Matricula matricula) {
        matriculas.add(matricula);
    }

    public Matricula buscarPorCodigo(int codigo) {
        for (Matricula m : matriculas) {
            if (m.getCodigo() == codigo) {
                return m;
            }
        }
        return null;
    }

    public List<Matricula> listarTodas() {
        return matriculas;
    }

    public void atualizar(Matricula matriculaAtualizada) {
        for (int i = 0; i < matriculas.size(); i++) {
            if (matriculas.get(i).getCodigo() == matriculaAtualizada.getCodigo()) {
                matriculas.set(i, matriculaAtualizada);
                return;
            }
        }
    }

    public void remover(int codigo) {
        matriculas.removeIf(m -> m.getCodigo() == codigo);
    }
}
