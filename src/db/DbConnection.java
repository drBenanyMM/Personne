package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import jakarta.mail.event.ConnectionAdapter;

public class DbConnection {

	private static DbConnection instance;
	private Connection connection;
	private String url = "jdbc:mysql://localhost:3306/soa";
	private String username = "root";
	private String password = "";

	private DbConnection() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(url, username, password);
			System.out.println("connecté");
		} catch (ClassNotFoundException ex) {
			System.out.println("Something is wrong with the DB connection String : " + ex.getMessage());
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public static DbConnection getInstance() throws SQLException {
		if (instance == null) {
			instance = new DbConnection();
		} else if (instance.getConnection().isClosed()) {
			instance = new DbConnection();
		}
		return instance;
	}

	public static void main(String[] args) {
		try {
			Connection connection = DbConnection.getInstance().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}