
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int action = 0;  // dummy value for the action

            System.out.println("Hello, Welcome to ReRent - Peer to Peer Borrowing and Lending");  //Welcome message

            while (action != 1 && action !=2){
            System.out.println("Would you like to proceed with (1)Login or (2)SignUp"); //Options for user
            action = sc.nextInt();     //User selecting what option they would like to proceed with

            if  (action != 1 && action !=2){
            System.out.println("Would you like to proceed with (1)Login or (2)SignUp");
            action = sc.nextInt();
            }
   }
            if (action == 1) {
                System.out.println("Thank You For Choosing Login");
                try {
                    UserLogin.userlogin();
                } catch (SQLException e) {
                    System.err.println("Error Occured During Login");
                }
            } else if (action == 2) {
                System.out.println("Thank You For Choosing SignUp");
               try {
                    UserSignup.userSignUp();  // Calling the signup method
                } catch (SQLException e) {
                    System.err.println("Error Occured During Signup:");
                }
            }
        }
         
   
    } 
   
}

