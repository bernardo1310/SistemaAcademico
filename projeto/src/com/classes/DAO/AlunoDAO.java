package com.classes.DAO;

import com.classes.DTO.Aluno;
import com.classes.DTO.SituacaoAluno;
import com.classes.Conexao.ConexaoBD;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    private static final String NOMEDATABELA = "Aluno"; // Nome da tabela de Alunos

    // Método para inserir um novo aluno
    public boolean inserir(Aluno aluno) {
        String sql = "INSERT INTO " + NOMEDATABELA + " (nome, status, situacao, cursoCodigo, turmaCodigo) VALUES (?, ?, ?, ?, ?);";

        try (Connection conn = ConexaoBD.getConexao(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
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
        }
    }
    // Método para verificar se um aluno existe no banco de dados
    public boolean existe(Aluno aluno) {
        String sql = "SELECT COUNT(*) FROM Aluno WHERE codigo = ?";
        
        try (Connection conn = ConexaoBD.getConexao();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, aluno.getCodigo());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    // Método para atualizar os dados de um aluno
    public boolean alterar(Aluno aluno) {
        String sql = "UPDATE " + NOMEDATABELA + " SET nome = ?, status = ?, situacao = ?, cursoCodigo = ?, turmaCodigo = ? WHERE codigo = ?";

        try (Connection conn = ConexaoBD.getConexao(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setString(1, aluno.getNome());
            ps.setBoolean(2, aluno.isStatus());
            ps.setString(3, aluno.getSituacao().toString());
            ps.setInt(4, aluno.getCurso().getCodigo());
            ps.setInt(5, aluno.getTurmaCodigo());
            ps.setInt(6, aluno.getCodigo()); // Definindo o código do aluno para atualizar
            int rowsUpdated = ps.executeUpdate();
            return rowsUpdated > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para excluir um aluno
    public boolean excluir(Aluno aluno) {
        String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codigo = ?";

        try (Connection conn = ConexaoBD.getConexao(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, aluno.getCodigo()); // Usando o código para excluir
            int rowsDeleted = ps.executeUpdate();
            return rowsDeleted > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Método para procurar um aluno por código
    public Aluno procurarPorCodigo(int codigo) {
        String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?";
        Aluno aluno = null;

        try (Connection conn = ConexaoBD.getConexao(); 
             PreparedStatement ps = conn.prepareStatement(sql)) {
            
            ps.setInt(1, codigo);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    aluno = new Aluno();
                    aluno.setCodigo(rs.getInt("codigo"));
                    aluno.setNome(rs.getString("nome"));
                    aluno.setStatus(rs.getBoolean("status"));
                    aluno.setSituacao(SituacaoAluno.valueOf(rs.getString("situacao")));
                    aluno.setTurmaCodigo(rs.getInt("turmaCodigo"));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return aluno;
    }

    // Método para listar todos os alunos
    public List<Aluno> listarTodos() {
        List<Aluno> alunos = new ArrayList<>();
        String sql = "SELECT * FROM " + NOMEDATABELA;

        try (Connection conn = ConexaoBD.getConexao(); 
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setCodigo(rs.getInt("codigo"));
                aluno.setNome(rs.getString("nome"));
                aluno.setStatus(rs.getBoolean("status"));
                aluno.setSituacao(SituacaoAluno.valueOf(rs.getString("situacao")));
                aluno.setTurmaCodigo(rs.getInt("turmaCodigo"));
                alunos.add(aluno);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return alunos;
    }
}
