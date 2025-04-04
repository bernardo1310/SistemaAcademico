package com.sistemaacademico.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD{
	final static String ProjetoFinal = "sistemaacademico";
	
    public static Connection conectar() {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/SistemaAcademico" ;
            return DriverManager.getConnection(url,"root","");
            
        } catch (Exception e) {
        	e.printStackTrace();
            return null;
        }
    }
}