import java.sql.Connection;
import java.sql.SQLException;

// This is a test file to check if the connection between the database and this application is working
public class TestDB {
    public static void main(String[] args) {
        try (Connection conn = DatabaseConnection.connect()) {
            if (conn != null) {
                System.out.println("Connected Successfully!");
            }
        } catch (SQLException e) {
            System.err.println("Connection failed:");
        }
    }
}
