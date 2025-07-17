import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// This class has the details needed to make the connection between the code and databse
public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/rerent_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Kanaad@2006";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}