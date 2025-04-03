package com.classes.DAO;

import com.classes.DTO.Aluno;
import com.classes.DTO.Curso;
import com.classes.DTO.SituacaoAluno;
import java.util.List;

public class TesteAlunoDAO {
    public static void main(String[] args) {
        AlunoDAO alunoDAO = new AlunoDAO();

        // Criando um novo aluno
        Aluno aluno = new Aluno();
        aluno.setNome("Carlos Silva");
        aluno.setStatus(true);
        aluno.setSituacao(SituacaoAluno.ATIVO);  // Exemplo de enum
        aluno.setCurso(new Curso());  // Adicionando o curso
        aluno.getCurso().setCodigo(1);  // Exemplo de código do curso
        aluno.setTurmaCodigo(101);

        // Teste de inserção
        if (alunoDAO.inserir(aluno)) {
            System.out.println("Aluno inserido com sucesso!");
        }

        // Teste de alteração
        aluno.setNome("Carlos Silva Souza");
        if (alunoDAO.alterar(aluno)) {
            System.out.println("Aluno alterado com sucesso!");
        }

        // Teste de consulta por código
        Aluno alunoEncontrado = alunoDAO.procurarPorCodigo(aluno.getCodigo());  // Consultando pelo código
        if (alunoEncontrado != null) {
            System.out.println("Aluno encontrado: " + alunoEncontrado);
        }

        // Teste de exclusão
        if (alunoDAO.excluir(aluno)) {
            System.out.println("Aluno excluído com sucesso!");
        }

        // Teste de listar todos os alunos
        List<Aluno> alunos = alunoDAO.listarTodos();
        System.out.println("Lista de todos os alunos: " + alunos);
    }
}
