import java.util.Scanner;

public class LendOrBorrow {
    public static void LendorBorrow() {
        try (Scanner sc = new Scanner(System.in)) {
            int action = 0;                                                                  // dummy value for the action

         while (action != 1 && action !=2){
            System.out.println("Would you like (1)Lend or (2)Borrow");                   //Options for user
            action = sc.nextInt();                                                        //User selecting what option they would like to proceed with

            if  (action != 1 && action !=2){
            System.out.println("Invalid choice would you like to (1)Lend or (2)Borrow");
            action = sc.nextInt();
            }
        }
            if (action == 1) {
                System.out.println("Thank you for choosing Lend");
                /// !!!! Lend
            } else if (action == 2) {
                System.out.println("Thank you for choosing Borrow");
               /// !!! Borrow
            } 
    }   
    }
}
