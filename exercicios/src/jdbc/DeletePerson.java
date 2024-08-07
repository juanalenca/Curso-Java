package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletePerson {

	public static void main(String[] args) throws SQLException{
		
		Scanner scan = new Scanner(System.in);	
		
		
		System.out.println("Inform the code: ");
		int code = scan.nextInt();
		
		
		Connection connection = ConnectionFactory.getConnection();
		String sql = "delete from people where code = ?";
		

		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, code);
		
		int counter = stmt .executeUpdate();
		
		if(counter > 0) {
			System.out.println("Person deleted successfully!");
		} else {
			System.out.println("Nothing was done!");
		}
		
		System.out.println("Affected lines: " + counter);
		
		
		connection.close();
		scan.close();
		
	}

}
