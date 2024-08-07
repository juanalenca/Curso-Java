package jdbc;

public class DAOTest {

	public static void main(String[] args) {


		DAO dao = new DAO();
		
		String sql = "insert into people (name, code) values (?, ?)";
		
		System.out.println(dao.include(sql, "Ana Julha", 1006));
		System.out.println(dao.include(sql, "Laura Moreira", 1001));
		System.out.println(dao.include(sql, "Maria Clara", 1002));		
		
		dao.close();

	}

}
