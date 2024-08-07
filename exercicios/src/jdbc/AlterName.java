package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterName {
	
	public static void main(String[] args) throws SQLException {
		
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Inform the code of the person: ");
		int code = scan.nextInt();
		
		
		String selectSql = "select code, name from people where code = ?";
		String updateSql = "update people set name = ? where code = ?";
		
		Connection connection = ConnectionFactory.getConnection();
		PreparedStatement stmt = connection.prepareStatement(selectSql);
		stmt.setInt(1, code);
		ResultSet result = stmt.executeQuery();
		
		if(result.next()) {
		
			Person p = new Person(result.getInt(1), result.getString(2));
			
			System.out.println("The current name is " + p.getName());
			scan.nextLine();
			
			System.out.println("Inform a new name: ");
			String newName = scan.nextLine();
			
			stmt.close();
			stmt = connection.prepareStatement(updateSql);
			stmt.setString(1, newName);
			stmt.setInt(2, code);
			stmt.execute();
			
			System.out.println("Person altered successfully!");
		
		} else {
			System.out.println("Person not found!");
		}
		
		
		
		
		connection.close();
		scan.close();
		
		
	}

}
