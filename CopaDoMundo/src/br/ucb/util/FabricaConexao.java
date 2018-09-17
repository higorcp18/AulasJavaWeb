package br.ucb.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

	private static Connection conexao;
	private static final String URL_CONNECTION = "jdbc:mysql://localhost/copadomundo";
	private static final String USER = "root";
	private static final String PASSWORD = "root";
	
	public static Connection getConexao() {
		if(conexao == null) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conexao = DriverManager.getConnection(URL_CONNECTION, USER, PASSWORD);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conexao;
	}
	
	public static void fecharConexao() {
		if(conexao != null){
			try {
				conexao.close();
				conexao = null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
