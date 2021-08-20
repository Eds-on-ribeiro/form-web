package org.senai.db;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	
	public static Connection conectar() /* throws Exception */ {

		try {
		Class.forName("org.postgresql.Driver");
		String url = "jdbc:postgresql://chunee.db.elephantsql.com:5432/mpnvkcxa";
		String usuarioDb = "mpnvkcxa";
		String senhaDb = "9JvWS9t5kMrUP0vCTrO80zXZzSnf6eeK";
		return DriverManager.getConnection(url, usuarioDb, senhaDb);
		} catch (Exception e) {
			System.out.println("Erro de conexão");
			e.printStackTrace();
			return null;
		}
		
	}
}
