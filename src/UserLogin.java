import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
// This class contains the methods for a user to Login
public class UserLogin {
public static boolean LoginStatus = false;                         // Declaring the variable for checking logins tatus in the safe default case
private static Scanner input = new Scanner(System.in);             // Using scanner class to read the inputs from user
public static void userlogin() throws SQLException{ 

  System.out.println("What is your username ?");
    String userName = input.next();                                // Input for username

  System.out.println("What is your password ?");
    String password = input.next();                                // Input for password

    String usernamequery = "SELECT username, password_hash FROM users WHERE username = ?"; // The SQL query to check if the username exists and password authentication
    try(Connection conn = DatabaseConnection.connect();
     PreparedStatement st = conn.prepareStatement(usernamequery)){ 
        st.setString(1,userName);
        ResultSet usernames = st.executeQuery();                   // This is the ResultSet from the SQL Query
        if(usernames.next()){
            String correctPassword = usernames.getString("password_hash");
            if(correctPassword.equals(password)){                  // Check if the password in the DB and entered password is the same.
                System.out.println("you have successfully logged In !!");
                LoginStatus = true;
            } else {
                System.out.println("You have entered the wrong password try Again !");
                 UserLogin.userlogin();                           // Recursion into login again afgter failed password.
                 LoginStatus = true;
                }
            
            } else {                                             // Option to login for trying again or option of signing up
                System.err.println("The given username does not exist");
                System.err.println("To try login again (1)");
                System.err.println("To Try signup (2)");
                int action = input.nextInt();
                LoginStatus = true;
                while (action != 1 && action !=2){
                    System.out.println("Invalid choice proceed with (1)Login or (2)SignUp"); 
                    action =input.nextInt();        
            }
                if(action == 1){
                    UserLogin.userlogin();
                } 
                else if (action == 2) {
                    UserSignup.userSignUp();
                
            }
        }
    }
}
}
