package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    private static final String URL = "jdbc:mysql://localhost:3306/nomedobanco"; // Substitua pelo nome do seu banco de dados
    private static final String USER = "usuario"; // Substitua pelo seu usuário
    private static final String PASSWORD = "senha"; // Substitua pela sua senha

    // Método para obter a conexão com o banco de dados
    public static Connection getConexao() throws SQLException {
        try {
            // Tente estabelecer a conexão
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            // Caso a conexão falhe, lance uma exceção
            throw new SQLException("Erro ao conectar ao banco de dados", e);
        }
    }
}
