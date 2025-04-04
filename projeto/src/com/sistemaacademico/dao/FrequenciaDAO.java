package com.sistemaacademico.dao;

import com.sistemaacademico.model.Frequencia;
import java.util.ArrayList;
import java.util.List;

public class FrequenciaDAO {
    private List<Frequencia> frequencias = new ArrayList<>();

    public void adicionar(Frequencia frequencia) {
        frequencias.add(frequencia);
    }

    public Frequencia buscarPorCodigo(int codigo) {
        for (Frequencia f : frequencias) {
            if (f.getCodigo() == codigo) {
                return f;
            }
        }
        return null;
    }

    public List<Frequencia> listarTodas() {
        return frequencias;
    }

    public void atualizar(Frequencia frequenciaAtualizada) {
        for (int i = 0; i < frequencias.size(); i++) {
            if (frequencias.get(i).getCodigo() == frequenciaAtualizada.getCodigo()) {
                frequencias.set(i, frequenciaAtualizada);
                return;
            }
        }
    }

    public void remover(int codigo) {
        frequencias.removeIf(f -> f.getCodigo() == codigo);
    }
}
