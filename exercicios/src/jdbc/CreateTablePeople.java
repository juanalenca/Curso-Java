package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTablePeople {

	public static void main(String[] args) throws SQLException {

		
		Connection connection = ConnectionFactory.getConnection();
		
		String sql = "create table if not exists people ("
				+ "code int auto_increment primary key,"
				+ "name varchar(100) not null"
				+ ");";
		
		Statement stmt = connection.createStatement();
		stmt.execute(sql);
		
		System.out.println("Table created successfully!");
		connection.close();
		

	}

}
