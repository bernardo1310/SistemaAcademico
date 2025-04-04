package com.sistemaacademico.bo;

import com.sistemaacademico.dao.CursoDAO;
import com.sistemaacademico.dto.CursoDTO;
import com.sistemaacademico.model.Curso;
import java.util.List;
import java.util.ArrayList;

public class CursoBO {
    private CursoDAO cursoDAO;

    public CursoBO() {
        this.cursoDAO = new CursoDAO();
    }

    public void adicionarCurso(CursoDTO cursoDTO) {
        if (cursoDTO.getNome() == null || cursoDTO.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome do curso não pode ser vazio.");
        }
        
        // Conversão de CursoDTO para Curso
        Curso curso = new Curso(cursoDTO.getCodigo(), cursoDTO.getNome());
        curso.setDescricao(cursoDTO.getDescricao());
        
        cursoDAO.adicionar(curso);
    }

    public CursoDTO buscarCurso(int codigo) {
        Curso curso = cursoDAO.buscarPorCodigo(codigo);
        if (curso == null) {
            return null;
        }

        // Conversão de Curso para CursoDTO
        CursoDTO cursoDTO = new CursoDTO();
        cursoDTO.setCodigo(curso.getCodigo());
        cursoDTO.setNome(curso.getNome());
        cursoDTO.setDescricao(curso.getDescricao());

        return cursoDTO;
    }

    public List<CursoDTO> listarCursos() {
        List<Curso> cursos = cursoDAO.listarTodos();
        List<CursoDTO> cursosDTO = new ArrayList<>();

        for (Curso curso : cursos) {
            // Conversão de Curso para CursoDTO
            CursoDTO cursoDTO = new CursoDTO();
            cursoDTO.setCodigo(curso.getCodigo());
            cursoDTO.setNome(curso.getNome());
            cursoDTO.setDescricao(curso.getDescricao());
            cursosDTO.add(cursoDTO);
        }

        return cursosDTO;
    }

    public void atualizarCurso(CursoDTO cursoDTO) {
        Curso curso = cursoDAO.buscarPorCodigo(cursoDTO.getCodigo());
        if (curso == null) {
            throw new IllegalArgumentException("Curso não encontrado.");
        }

        curso.setNome(cursoDTO.getNome());
        curso.setDescricao(cursoDTO.getDescricao());

        cursoDAO.atualizar(curso);
    }

    public void removerCurso(int codigo) {
        Curso curso = cursoDAO.buscarPorCodigo(codigo);
        if (curso == null) {
            throw new IllegalArgumentException("Curso não encontrado.");
        }

        cursoDAO.remover(codigo);
    }
}
