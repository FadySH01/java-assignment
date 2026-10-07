package Java.Chapter4.Checked;
import java.sql.*;
public class SQLExceptionExample {


        public static void main(String[] args) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "wrong");
            } catch (SQLException e) {
                System.out.println("SQLException: " + e.getMessage());
            }
        }
    }

