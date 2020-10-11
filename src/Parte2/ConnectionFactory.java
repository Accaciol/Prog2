package Parte2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		String url = "jdbc:postgresql://localhost:5432/av1";
		String user = "postgres";
		String password = "1162";// Senha do usuario postgres
		try {
			return DriverManager.getConnection(url, user, password);
		}catch (SQLException e) {
			System.out.println(e);
			throw new RuntimeException();
		}
	}
}
