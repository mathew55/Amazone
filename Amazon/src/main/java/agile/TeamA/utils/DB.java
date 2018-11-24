package agile.TeamA.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {
	public Connection initDB() {
		Connection conn = null;
		try {
			/**
			 * this part use for high version mysql database(over 8.0)
			 */
			/*
			 * Class.forName("com.mysql.cj.jdbc.Driver"); conn =
			 * DriverManager.getConnection(
			 * "jdbc:mysql://localhost:3307/amazone?useUnicode=true&characterEncoding=utf-8&useSSL=false&serverTimezone=GMT%2B8",
			 * "root", "admin"); System.out.println("conectando"); return conn;
			 */

			/**
			 * due to mysql dabase version is too high change need to use new connection-jar
			 * version and new method to link to database
			 */

			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties properties = new Properties();
			properties.setProperty("user", "root");
			properties.setProperty("password", "admin");
			properties.setProperty("useLL", "false");
			properties.setProperty("autoReconnect", "true");
			String url = "jdbc:mysql://localhost:3307/amazone";
			conn = DriverManager.getConnection(url, properties);
			return conn;

		} /*
			 * catch (ClassNotFoundException e) {
			 * 
			 * e.printStackTrace(); } catch (SQLException e) {
			 * 
			 * e.printStackTrace(); } return conn;
			 */
		catch (ClassNotFoundException cnfe) {
			System.out.println("driver nao encontrado: " + cnfe.getMessage());
			return null;
		} catch (SQLException sql) {
			System.out.println("SQLException: " + sql.getMessage());
			System.out.println("SQLState: " + sql.getSQLState());
			System.out.println("Erro: " + sql.getErrorCode());
			System.out.println("StackTrace: " + sql.getStackTrace());
			return null;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}

	public void closeDB(Statement sta, Connection conn) {
		try {
			sta.close();
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void fecharBDcon(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
			System.out.println("erro ao fechar o banco" + e.getMessage());
		}
	}

	public static void main(String arr[]) {
		System.out.println("Making connection..");
		// Connection connection = Dbmanage.initDB();
		// System.out.println(connection == null);
		System.out.println("Connection made...");
	}

	public void closeDB(ResultSet rs, Statement sta, Connection conn) {
		try {
			rs.close();
			sta.close();
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
