package org.speranza.ex12pag40;

import java.sql.SQLException;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestQueryex12pag40 {

	private static Weld weld;
	private static WeldContainer container;
	
	@BeforeClass
	public static void init() {
		weld = new Weld();
		container = weld.initialize();
	}
	
	@AfterClass
	public static void destroy() {
		container.shutdown();
	}
	
	@Test
	public void testCreateConnection() throws SQLException {
		MysqlPingService12 mysql = container.instance().select(MysqlPingService12.class).get();
		int numRecord = mysql.ping();
		Assert.assertEquals(numRecord, 1);
	}
}
