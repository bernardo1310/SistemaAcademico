package com.classes.DAO;


import java.util.List;
import com.classes.DTO.Curso;

public class TestaCursoDAO {
    public static void main(String[] args) {
        CursoDAO cursoDAO = new CursoDAO();

        // Criando um novo curso
        Curso curso = new Curso();
        curso.setNome("Matemática");
        curso.setDescricao("Curso de Matemática Básica");

        // Teste de inserção
        if (cursoDAO.inserir(curso)) {
            System.out.println("Curso inserido com sucesso!");
        }

        // Teste de alteração
        curso.setDescricao("Curso de Matemática Avançada");
        if (cursoDAO.alterar(curso)) {
            System.out.println("Curso alterado com sucesso!");
        }

        // Teste de consulta por código
        Curso cursoEncontrado = cursoDAO.procurarPorCodigo(curso.getCodigo());
        if (cursoEncontrado != null) {
            System.out.println("Curso encontrado: " + cursoEncontrado.getNome());
        }

        // Teste de exclusão
        if (cursoDAO.excluir(curso)) {
            System.out.println("Curso excluído com sucesso!");
        }

        // Teste de listar todos os cursos
        List<Curso> cursos = cursoDAO.listarTodos();
        System.out.println("Lista de todos os cursos: " + cursos);
    }
}
