package org.speranza.ex12pag40;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

public class JDBCConnectionProducer13 {

	@Produces
	private Connection createConnection() {
		Connection connection = null;
		try {
			Class.forName(Driver.class.getName()).newInstance();
			connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/javaee", "root", "");
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public void destroyConnection(@Disposes Connection connection) throws SQLException {
		connection.close();
	}
	
}
