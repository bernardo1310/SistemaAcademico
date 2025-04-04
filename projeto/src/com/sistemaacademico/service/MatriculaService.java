package com.sistemaacademico.service;

import com.sistemaacademico.dao.MatriculaDAO;
import com.sistemaacademico.model.Matricula;
import java.util.List;

public class MatriculaService {
    private MatriculaDAO matriculaDAO;

    public MatriculaService() {
        this.matriculaDAO = new MatriculaDAO();
    }

    public void adicionarMatricula(Matricula matricula) {
        if (matricula.getAlunoCodigo() == 0 || matricula.getCursoCodigo() == 0) {
            throw new IllegalArgumentException("Aluno e curso são obrigatórios para a matrícula.");
        }
        matriculaDAO.adicionar(matricula);
    }

    public Matricula buscarMatricula(int codigo) {
        return matriculaDAO.buscarPorCodigo(codigo);
    }

    public List<Matricula> listarMatriculas() {
        return matriculaDAO.listarTodas();
    }

    public void atualizarMatricula(Matricula matricula) {
        matriculaDAO.atualizar(matricula);
    }

    public void removerMatricula(int codigo) {
        matriculaDAO.remover(codigo);
    }
}
