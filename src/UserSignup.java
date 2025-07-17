import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
// This is a class that contains all the methods regarding user loggin or signups
public class UserSignup {

    private static Scanner input = new Scanner(System.in);         // Using the scanner class to read inputs from user, calling it input

    public static void userSignUp() throws SQLException{

    System.out.println("What is your first name ?");                           
    String firstname = input.next();                                // Input First Name
    
    System.out.println("What is your last name ?");                            
    String lastname = input.next();                                 // Input Last Name

    System.out.println("What is your contact number?");
    String contactnumber = input.next();                            // Input Contact Number

    System.out.println("What is your email id ?");
    String email = input.next();                                    // Input Email Id

    System.out.println("What would you like to be your username ?");
    String userName = input.next();                                 // Input Username

    System.out.println("What would you like to be your password ?");
    String password = input.next();                                 // Input Password

    User user = new User(0, firstname, lastname, contactnumber, email, userName, password); // Making a new user

    String registrationquery = "INSERT INTO users (firstname, lastname, contactnumber, email, username, password_hash) VALUES (?,?,?,?,?,?)";
    try(Connection conn = DatabaseConnection.connect();
     PreparedStatement stmt = conn.prepareStatement(registrationquery)){
        stmt.setString(1, user.getFirstName());
        stmt.setString(2, user.getLastName());
        stmt.setString(3, user.getContactNumber());
        stmt.setString(4, user.getEmail());
        stmt.setString(5, user.getUserName());
        stmt.setString(6, user.getPassword());
        int rowsInserted = stmt.executeUpdate();

            // Checking if the user details have been added to the database.
            if (rowsInserted == 1) {
                System.out.println("You have been registered successfully!");
                System.out.println("Procced to Login");
                UserLogin.userlogin();
            } else {
                System.out.println("Something went wrong. Please try again.");
            }

        } catch (SQLException e) {
            System.err.println("Error during signup: " + e.getMessage());
        }
    }
 

}

