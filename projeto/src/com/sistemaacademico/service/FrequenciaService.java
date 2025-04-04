package com.sistemaacademico.service;

import com.sistemaacademico.dao.FrequenciaDAO;
import com.sistemaacademico.model.Frequencia;
import java.util.List;

public class FrequenciaService {
    private FrequenciaDAO frequenciaDAO;

    public FrequenciaService() {
        this.frequenciaDAO = new FrequenciaDAO();
    }

    public void registrarFrequencia(Frequencia frequencia) {
        if (frequencia.getAluno() == null || frequencia.getDisciplina() == null) {
            throw new IllegalArgumentException("Aluno e disciplina são obrigatórios para registrar frequência.");
        }
        frequenciaDAO.adicionar(frequencia);
    }

    public Frequencia buscarFrequencia(int codigo) {
        return frequenciaDAO.buscarPorCodigo(codigo);
    }

    public List<Frequencia> listarFrequencias() {
        return frequenciaDAO.listarTodas();
    }

    public void atualizarFrequencia(Frequencia frequencia) {
        frequenciaDAO.atualizar(frequencia);
    }

    public void removerFrequencia(int codigo) {
        frequenciaDAO.remover(codigo);
    }
}
