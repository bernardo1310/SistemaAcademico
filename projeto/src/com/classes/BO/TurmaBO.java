package com.classes.BO;

import com.classes.DTO.Turma;
import com.classes.DAO.TurmaDAO;
import java.util.List;

public class TurmaBO {
    public boolean inserir(Turma turma) {
        TurmaDAO turmaDAO = new TurmaDAO();
        return turmaDAO.inserir(turma);
    }
    
    public boolean alterar(Turma turma) {
        TurmaDAO turmaDAO = new TurmaDAO();
        return turmaDAO.alterar(turma);
    }
    
    public boolean excluir(Turma turma) {
        TurmaDAO turmaDAO = new TurmaDAO();
        return turmaDAO.excluir(turma);
    }
    
    public List<Turma> listarTodas() {
        TurmaDAO turmaDAO = new TurmaDAO();
        return turmaDAO.listarTodas();
    }
}