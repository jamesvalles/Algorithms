//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;


import java.sql.*;

public class MySqlConnect {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    //Connect to a MYSQL datbase
    public MySqlConnect() {
        try {

            String driver = "com.mysql.jdbc.Driver";
            String url = "[host/port/db name";
            String username = "[username]";
            String password = "[password]";

            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database");


        } catch (Exception ex) {
            System.out.println("Error found: " + ex);
        }
    }

    public static void main(String[] args) throws SQLException {
        MySqlConnect connect = new MySqlConnect();


    }
}
