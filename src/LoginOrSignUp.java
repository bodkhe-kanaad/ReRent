import java.sql.SQLException;
import java.util.Scanner;

public class LoginOrSignUp {
    public static boolean LoginorSignUp() {
        while (UserLogin.LoginStatus == false){
        try (Scanner sc = new Scanner(System.in)) {
            int action = 0;  // dummy value for the action

         while (action != 1 && action !=2){
            System.out.println("Would you like to proceed with (1)Login or (2)SignUp"); //Options for user
            action = sc.nextInt();                                                        //User selecting what option they would like to proceed with

            if  (action != 1 && action !=2){
            System.out.println("Would you like to proceed with (1)Login or (2)SignUp");
            action = sc.nextInt();
            }
        }
            if (action == 1) {
                System.out.println("Thank You For Choosing Login");
                try {
                    UserLogin.userlogin(); // Calling the Login method
                } catch (SQLException e) {
                    System.err.println("Error Occured During Login");
                }
            } else if (action == 2) {
                System.out.println("Thank You For Choosing SignUp");
               try {
                    UserSignup.userSignUp();  // Calling the SignUp method
                } catch (SQLException e) {
                    System.err.println("Error Occured During Signup:");
                }
            }
        
    }
}
return true;
}
}
    
