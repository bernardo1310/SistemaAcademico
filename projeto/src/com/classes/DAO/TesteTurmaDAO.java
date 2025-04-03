package com.classes.DAO;

import com.classes.DTO.Turma;

public class TesteTurmaDAO {

    public static void main(String[] args) {
        Turma turma = new Turma();
        turma.setNome("Turma 1");
        turma.setCursoCodigo(1); // Defina o curso correspondente

        TurmaDAO turmaDAO = new TurmaDAO();
        turmaDAO.inserir(turma); // Inserir a turma no banco

        System.out.println("Turma inserida com sucesso!");
    }
}
