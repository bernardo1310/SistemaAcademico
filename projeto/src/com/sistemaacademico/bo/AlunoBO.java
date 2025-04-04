package com.sistemaacademico.bo;

import com.sistemaacademico.dao.AlunoDAO;
import com.sistemaacademico.dto.AlunoDTO;
import com.sistemaacademico.dto.MatriculaDTO;
import com.sistemaacademico.model.Aluno;
import com.sistemaacademico.model.Matricula;

import java.util.List;
import java.util.ArrayList;

public class AlunoBO {
    private AlunoDAO alunoDAO;

    public AlunoBO() {
        this.alunoDAO = new AlunoDAO();
    }

    public void adicionarAluno(AlunoDTO alunoDTO) {
        if (alunoDTO.getNome() == null || alunoDTO.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome do aluno não pode ser vazio.");
        }

        Aluno aluno = new Aluno(alunoDTO.getCodigo(), alunoDTO.getNome());
        
        // Adiciona as matrículas do DTO para o modelo
        for (MatriculaDTO matriculaDTO : alunoDTO.getMatriculas()) {
            Matricula matricula = new Matricula(); // Assumindo que a Matricula tenha um construtor adequado
            matricula.setCodigo(matriculaDTO.getCodigo()); // Ajuste conforme os métodos na Matricula
            aluno.adicionarMatricula(matricula);
        }

        alunoDAO.adicionar(aluno);
    }

    public AlunoDTO buscarAluno(int codigo) {
        Aluno aluno = alunoDAO.buscarPorCodigo(codigo);
        if (aluno == null) {
            return null;
        }

        AlunoDTO alunoDTO = new AlunoDTO();
        alunoDTO.setCodigo(aluno.getCodigo());
        alunoDTO.setNome(aluno.getNome());

        // Converte as matrículas do modelo para DTOs
        List<MatriculaDTO> matriculasDTO = new ArrayList<>();
        for (Matricula matricula : aluno.getMatriculas()) {
            MatriculaDTO matriculaDTO = new MatriculaDTO(); // Assumindo que MatriculaDTO tem os métodos adequados
            matriculaDTO.setCodigo(matricula.getCodigo()); // Ajuste conforme os métodos na Matricula
            matriculasDTO.add(matriculaDTO);
        }
        alunoDTO.setMatriculas(matriculasDTO);

        return alunoDTO;
    }

    public List<AlunoDTO> listarAlunos() {
        List<Aluno> alunos = alunoDAO.listarTodos();
        List<AlunoDTO> alunosDTO = new ArrayList<>();
        
        for (Aluno aluno : alunos) {
            AlunoDTO alunoDTO = new AlunoDTO();
            alunoDTO.setCodigo(aluno.getCodigo());
            alunoDTO.setNome(aluno.getNome());
            
            // Converte as matrículas do modelo para DTOs
            List<MatriculaDTO> matriculasDTO = new ArrayList<>();
            for (Matricula matricula : aluno.getMatriculas()) {
                MatriculaDTO matriculaDTO = new MatriculaDTO(); // Ajuste conforme os métodos na MatriculaDTO
                matriculaDTO.setCodigo(matricula.getCodigo());
                matriculasDTO.add(matriculaDTO);
            }
            alunoDTO.setMatriculas(matriculasDTO);
            
            alunosDTO.add(alunoDTO);
        }
        
        return alunosDTO;
    }

    public void atualizarAluno(AlunoDTO alunoDTO) {
        Aluno aluno = alunoDAO.buscarPorCodigo(alunoDTO.getCodigo());
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno não encontrado.");
        }

        aluno.setNome(alunoDTO.getNome());

        // Atualiza as matrículas
        aluno.getMatriculas().clear();
        for (MatriculaDTO matriculaDTO : alunoDTO.getMatriculas()) {
            Matricula matricula = new Matricula(); // Novo objeto Matricula, ajustado conforme necessário
            matricula.setCodigo(matriculaDTO.getCodigo());
            aluno.adicionarMatricula(matricula);
        }

        alunoDAO.atualizar(aluno);
    }

    public void removerAluno(int codigo) {
        Aluno aluno = alunoDAO.buscarPorCodigo(codigo);
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno não encontrado.");
        }

        alunoDAO.remover(codigo);
    }
}
