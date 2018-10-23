package agile.TeamA.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbmanage {
    public Connection initDB() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3307/DemoDB";
            conn = DriverManager.getConnection(url,"root", "admin");
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return conn;
    }

    public void closeDB(Statement sta, Connection conn) {
        try {
            sta.close();
            conn.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }

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