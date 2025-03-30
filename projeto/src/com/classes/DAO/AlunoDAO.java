package com.classes.DAO;

import com.classes.DTO.Aluno;
import com.utils.ConexaoBD;  // Importa a classe de ConexaoBD do pacote com.utils

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {

    private static final String NOMEDATABELA = "Aluno"; // Nome da tabela de Alunos

    public boolean inserir(Aluno aluno) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = ConexaoBD.getConexao();  // Usando a conexão que vem de com.utils
            String sql = "INSERT INTO " + NOMEDATABELA + " (nome, status, situacao, cursoCodigo, turmaCodigo) VALUES (?, ?, ?, ?, ?);";
            ps = conn.prepareStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setBoolean(2, aluno.isStatus());
            ps.setString(3, aluno.getSituacao().toString());
            ps.setInt(4, aluno.getCurso().getCodigo());
            ps.setInt(5, aluno.getTurmaCodigo());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
