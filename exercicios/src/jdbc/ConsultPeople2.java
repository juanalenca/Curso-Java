package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultPeople2 {

	public static void main(String[] args) throws SQLException {

		Scanner scan = new Scanner(System.in);

		
		Connection connection = ConnectionFactory.getConnection();
		String sql = "select * from people where name like ?";
		
		
		System.out.println("inform the value of the research: ");
		String value = scan.nextLine();

		
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setString(1, "%" + value + "%");
		ResultSet result = stmt.executeQuery();

		
		List<Person> people = new ArrayList<>();

		while (result.next()) {
			int code = result.getInt("code");
			String name = result.getString("name");
			people.add(new Person(code, name));
		}

		for (Person p : people) {
			System.out.println(p.getCode() + " ==> " + p.getName());
		}

		stmt.close();
		connection.close();
		scan.close();

	}

}
