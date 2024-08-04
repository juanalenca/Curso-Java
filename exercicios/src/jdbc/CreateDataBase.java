package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDataBase {

	public static void main(String[] args) throws SQLException {
		
		
		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String user = "root";
		final String password = "123456"; 
		
		
		Connection connection = DriverManager 
				.getConnection(url, user, password);

		
		Statement stmt = connection.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS course_java");

		
		System.out.println("Banco criado com sucesso!");
		connection.close();  
		
		
	}

}
