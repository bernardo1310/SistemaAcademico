package com.classes.DAO;

import com.classes.DTO.Turma;
import com.classes.Conexao.ConexaoBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TurmaDAO {

    public boolean inserir(Turma turma) {
        String sql = "INSERT INTO Turma (nome, curso_codigo) VALUES (?, ?)";
        try (Connection conn = ConexaoBD.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, turma.getNome());
            stmt.setInt(2, turma.getCursoCodigo());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean alterar(Turma turma) {
        String sql = "UPDATE Turma SET nome = ?, curso_codigo = ? WHERE codigo = ?";
        try (Connection conn = ConexaoBD.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, turma.getNome());
            stmt.setInt(2, turma.getCursoCodigo());
            stmt.setInt(3, turma.getCodigo());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(Turma turma) {
        String sql = "DELETE FROM Turma WHERE codigo = ?";
        try (Connection conn = ConexaoBD.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, turma.getCodigo());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Turma> listarTodas() {
        String sql = "SELECT * FROM Turma";
        List<Turma> turmas = new ArrayList<>();
        try (Connection conn = ConexaoBD.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Turma turma = new Turma();
                turma.setCodigo(rs.getInt("codigo"));
                turma.setNome(rs.getString("nome"));
                turma.setCursoCodigo(rs.getInt("curso_codigo"));
                turmas.add(turma);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return turmas;
    }
}
