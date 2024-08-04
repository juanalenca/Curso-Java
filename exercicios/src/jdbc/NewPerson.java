package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NewPerson {

	public static void main(String[] args) throws SQLException {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Provide your name: ");
		String name = scan.nextLine();
		
		
		Connection connection = ConnectionFactory.getConnection();
		
		
		String sql = "insert into people (name) values (?)";
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, name);
		
		
		stmt.execute();
		
				
		System.out.println("Person successfully included!");
		scan.close();
		
	}

}
