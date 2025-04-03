package com.classes.BO;

package com.classes.DAO;

import com.classes.DTO.Aluno;
import java.util.List;

public class AlunoBO {
    public boolean inserir(Aluno aluno) {
        AlunoDAO alunoDAO = new AlunoDAO();
        if (!existe(aluno)) {
            return alunoDAO.inserir(aluno);
        }
        return false;
    }
    
    public boolean alterar(Aluno aluno) {
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.alterar(aluno);
    }
    
    public boolean excluir(Aluno aluno) {
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.excluir(aluno);
    }
    
    public boolean existe(Aluno aluno) {
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.existe(aluno);
    }
    
    public List<Aluno> listarTodos() {
        AlunoDAO alunoDAO = new AlunoDAO();
        return alunoDAO.listarTodos(); 
    }
}
