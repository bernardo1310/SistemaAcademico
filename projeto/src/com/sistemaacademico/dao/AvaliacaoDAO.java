package com.sistemaacademico.dao;

import com.sistemaacademico.model.Avaliacao;
import java.util.ArrayList;
import java.util.List;

public class AvaliacaoDAO {
    private List<Avaliacao> avaliacoes = new ArrayList<>();

    public void adicionar(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public Avaliacao buscarPorCodigo(int codigo) {
        for (Avaliacao a : avaliacoes) {
            if (a.getCodigo() == codigo) {
                return a;
            }
        }
        return null;
    }

    public List<Avaliacao> listarTodas() {
        return new ArrayList<>(avaliacoes);
    }

    public void atualizar(Avaliacao avaliacaoAtualizada) {
        for (int i = 0; i < avaliacoes.size(); i++) {
            if (avaliacoes.get(i).getCodigo() == avaliacaoAtualizada.getCodigo()) {
                avaliacoes.set(i, avaliacaoAtualizada);
                return;
            }
        }
    }

    public void remover(int codigo) {
        avaliacoes.removeIf(a -> a.getCodigo() == codigo);
    }
}
