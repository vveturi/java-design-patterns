/**
 * 
 */
package org.spring.demo.design_patterns.creational;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.derby.jdbc.EmbeddedDriver;

/**
 * @author veturi
 *
 */
public class DatabaseSingleton {
	private static volatile DatabaseSingleton instance = null;
	private static volatile Connection conn = null;

	private DatabaseSingleton() {

		try {
			DriverManager.registerDriver(new EmbeddedDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (conn != null) {
			throw new RuntimeException("Use getConnection() method to create");
		}

		if (instance != null) {
			throw new RuntimeException("Use getInstance() method to create");
		}
	}

	public static DatabaseSingleton getInstance() {
		if (instance == null) {
			synchronized (DatabaseSingleton.class) {
				if (instance == null) {
					instance = new DatabaseSingleton();
				}
			}
		}

		return instance;
	}

	public Connection getConnection() {
		if (conn == null) {
			synchronized (DatabaseSingleton.class) {
				if (conn == null) {
					try {
						String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

						conn = DriverManager.getConnection(dbUrl);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}

		return conn;
	}
}
