package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultPeople1 {

	public static void main(String[] args) throws SQLException {
		
		
		Connection connection = ConnectionFactory.getConnection();
		String sql = "select * from people";
		
		Statement stmt = connection.createStatement();
		ResultSet result = stmt.executeQuery(sql);
		
		List<Person> people = new ArrayList<>();
		
		while(result.next()) {
			int code = result.getInt("code");
			String name = result.getString("name");
			people.add(new Person(code, name));
		}
		
		for(Person p: people) {
			System.out.println(p.getCode() + " ==> " + p.getName());
		}
		
		stmt.close();
		connection.close();
		

	}

}
