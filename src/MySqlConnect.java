//import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Statement;


import java.sql.*;
import java.util.ArrayList;

public class MySqlConnect {
    private static Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public static Connection MySqlConnect() {
        try {

            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/employee";


            String username = "root";
            String password = "Password12";

            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database");

        } catch (Exception ex) {
            System.out.println("Error found: " + ex);
        }
        return connection;
    }

    public static void createTable() throws Exception {
        try {
            Connection connection = MySqlConnect();
            PreparedStatement create = connection.prepareStatement("CREATE TABLE IF NOT EXISTS benefits(employee_id INT NOT NULL AUTO_INCREMENT, weekly_amount INT, medical_plan VARCHAR(255), date_enrolled DATE, PRIMARY KEY(employee_id));"); ;
            create.executeUpdate();
            System.out.println("Table created.");
        } catch (Exception ex) {
            System.out.println("Creation failed" + ex);
        }
        finally {
            System.out.println("Process completed");
        }
    }


    public static void post() throws Exception {
        try {
            Connection connection = MySqlConnect();

            //PreparedStatement create = connection.prepareStatement("ALTER TABLE benefits AUTO_INCREMENT=100;");


            PreparedStatement create = connection.prepareStatement("INSERT INTO benefits(weekly_amount, medical_plan, date_enrolled) VALUES( 12, \"BlueCross\", NOW());");
            create.executeUpdate();
            System.out.println("Item inserted.");
        } catch (Exception ex) {
            System.out.println("Insert failed" + ex);
        }
        finally {
            System.out.println("Process completed");
        }
    }


    public static ArrayList<String> get() throws Exception {
        ArrayList<String>  results = new ArrayList<>();

        try {
            Connection connection = MySqlConnect();
            PreparedStatement create = connection.prepareStatement("SELECT * FROM benefits;");
            ResultSet resultSet = create.executeQuery();

            System.out.println("\temployee_id \t weekly_amount \t medical_plan \t\tdate_enrolled");
            System.out.println("-------------------------------------------------------------------------");
            while(resultSet.next()){
                System.out.print("\t\t" + resultSet.getString("employee_id") + "\t\t\t");
                System.out.print("\t\t"  + resultSet.getString("weekly_amount") + "\t\t\t");
                System.out.print(resultSet.getString("medical_plan") + "\t\t\t");
                System.out.print(resultSet.getString("date_enrolled") + "\t\t");
                System.out.println();

                results.add(resultSet.getString("employee_id"));
            }
            System.out.println("\nGet performed.");
        } catch (Exception ex) {
            System.out.println("Get failed" + ex);
        }
        finally {
            System.out.println("Process completed");
        }
        return results;
    }


    public static void main(String[] args) throws Exception {
       //Connection connect = MySqlConnect();
      // createTable();
       post();
        get();
    }
}
