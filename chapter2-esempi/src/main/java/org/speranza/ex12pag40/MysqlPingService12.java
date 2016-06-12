package org.speranza.ex12pag40;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;

import com.mysql.jdbc.Connection;

public class MysqlPingService12 {

	@Inject
	private Connection connection;
	
	public int ping() throws SQLException {
		ResultSet resultset = connection.createStatement().executeQuery("select count(*) from persons");
		resultset.first();
		return resultset.getInt(1);
		
	}
}
