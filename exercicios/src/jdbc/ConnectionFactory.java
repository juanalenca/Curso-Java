package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	public static Connection getConnection() {
		try {
			Properties prop = getProperties();
			final String url = prop.getProperty("base.url");
			final String user = prop.getProperty("base.user");
			final String password = prop.getProperty("base.password");
			
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String path = "/connection.properties";
			
		prop.load(ConnectionFactory.class.getResourceAsStream(path));
		
		return prop;
	}

}
