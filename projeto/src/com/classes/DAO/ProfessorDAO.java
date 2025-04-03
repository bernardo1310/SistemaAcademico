package com.classes.DAO;

import com.classes.DTO.Professor;
import com.classes.Conexao.ConexaoBD;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {

    private Connection conexao;

    public ProfessorDAO() {
        this.conexao = ConexaoBD.getConnection();
    }

    public boolean inserir(Professor professor) {
        String sql = "INSERT INTO professor (nome) VALUES (?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, professor.getNome());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean alterar(Professor professor) {
        String sql = "UPDATE professor SET nome = ? WHERE codigo = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, professor.getNome());
            stmt.setInt(2, professor.getCodigo());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(Professor professor) {
        String sql = "DELETE FROM professor WHERE codigo = ?";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, professor.getCodigo());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Professor> listarTodos() {
        List<Professor> lista = new ArrayList<>();
        String sql = "SELECT * FROM professor";
        try (PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Professor professor = new Professor();
                professor.setCodigo(rs.getInt("codigo"));
                professor.setNome(rs.getString("nome"));
                lista.add(professor);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
