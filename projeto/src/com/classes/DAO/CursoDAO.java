package com.classes.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.classes.Conexao.ConexaoBD;
import com.classes.DTO.Curso;

public class CursoDAO {

    final String NOMEDATABELA = "Curso";
    //INSERT
    public boolean inserir(Curso curso) {
        try {
            Connection conn = ConexaoBD.getConexao();
            // Atualizando para incluir 'descricao' no comando SQL
            String sql = "INSERT INTO " + NOMEDATABELA + " (nome, descricao) VALUES (?, ?);";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, curso.getNome());
            ps.setString(2, curso.getDescricao()); // Passando o valor de descricao
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    //Update
    public boolean alterar(Curso curso) {
        try {
            Connection conn = ConexaoBD.getConexao();
            // Comando SQL para alterar o curso
            String sql = "UPDATE " + NOMEDATABELA + " SET nome = ?, descricao = ? WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, curso.getNome());
            ps.setString(2, curso.getDescricao());
            ps.setInt(3, curso.getCodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    //Delete
    public boolean excluir(Curso curso) {
        try {
            Connection conn = ConexaoBD.getConexao();
            // Comando SQL para excluir o curso
            String sql = "DELETE FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, curso.getCodigo());
            ps.executeUpdate();
            ps.close();
            conn.close();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    //read
    public Curso procurarPorCodigo(int codigo) {
        try {
            Connection conn = ConexaoBD.getConexao();
            // Comando SQL para buscar o curso pelo código
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE codigo = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Curso curso = new Curso();
                curso.setCodigo(rs.getInt("codigo"));
                curso.setNome(rs.getString("nome"));
                curso.setDescricao(rs.getString("descricao"));
                rs.close();
                ps.close();
                conn.close();
                return curso;
            } else {
                rs.close();
                ps.close();
                conn.close();
                return null;  // Não encontrou o curso
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        
    }
    //read
    public Curso procurarPorNome(String nome) {
        try {
            Connection conn = ConexaoBD.getConexao();
            // Comando SQL para buscar o curso pelo nome
            String sql = "SELECT * FROM " + NOMEDATABELA + " WHERE nome = ?;";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nome);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Curso curso = new Curso();
                curso.setCodigo(rs.getInt("codigo"));
                curso.setNome(rs.getString("nome"));
                curso.setDescricao(rs.getString("descricao"));
                rs.close();
                ps.close();
                conn.close();
                return curso;
            } else {
                rs.close();
                ps.close();
                conn.close();
                return null;  // Não encontrou o curso
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Curso> listarTodos() {
        try {
            Connection conn = ConexaoBD.getConexao();
            // Comando SQL para buscar todos os cursos
            String sql = "SELECT * FROM " + NOMEDATABELA + ";";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            List<Curso> cursos = new ArrayList<>();
            while (rs.next()) {
                Curso curso = new Curso();
                curso.setCodigo(rs.getInt("codigo"));
                curso.setNome(rs.getString("nome"));
                curso.setDescricao(rs.getString("descricao"));
                cursos.add(curso);
            }
            rs.close();
            ps.close();
            conn.close();
            return cursos;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }



}
