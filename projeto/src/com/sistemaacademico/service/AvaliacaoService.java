package com.sistemaacademico.service;

import com.sistemaacademico.dao.AvaliacaoDAO;
import com.sistemaacademico.model.Avaliacao;
import java.util.List;

public class AvaliacaoService {
    private AvaliacaoDAO avaliacaoDAO;

    public AvaliacaoService() {
        this.avaliacaoDAO = new AvaliacaoDAO();
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        if (avaliacao.getNota() < 0 || avaliacao.getNota() > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 10.");
        }
        avaliacaoDAO.adicionar(avaliacao);
    }

    public Avaliacao buscarAvaliacao(int codigo) {
        return avaliacaoDAO.buscarPorCodigo(codigo);
    }

    public List<Avaliacao> listarAvaliacoes() {
        return avaliacaoDAO.listarTodas();
    }

    public void atualizarAvaliacao(Avaliacao avaliacao) {
        avaliacaoDAO.atualizar(avaliacao);
    }

    public void removerAvaliacao(int codigo) {
        avaliacaoDAO.remover(codigo);
    }
}
