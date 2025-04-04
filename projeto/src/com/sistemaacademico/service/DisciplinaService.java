package com.sistemaacademico.service;

import com.sistemaacademico.dao.DisciplinaDAO;
import com.sistemaacademico.model.Disciplina;
import java.util.List;

public class DisciplinaService {
    private DisciplinaDAO disciplinaDAO;

    public DisciplinaService() {
        this.disciplinaDAO = new DisciplinaDAO();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        if (disciplina.getNome() == null || disciplina.getNome().isEmpty()) {
            throw new IllegalArgumentException("O nome da disciplina não pode ser vazio.");
        }
        disciplinaDAO.adicionar(disciplina);
    }

    public Disciplina buscarDisciplina(int codigo) {
        return disciplinaDAO.buscarPorCodigo(codigo);
    }

    public List<Disciplina> listarDisciplinas() {
        return disciplinaDAO.listarTodas();
    }

    public void atualizarDisciplina(Disciplina disciplina) {
        disciplinaDAO.atualizar(disciplina);
    }

    public void removerDisciplina(int codigo) {
        disciplinaDAO.remover(codigo);
    }
}
