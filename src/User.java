
// The user object represents a user who will login to the web application for borrowing or lending various items

public class User {
    private final  int    userId;                  // Unique id for each user
    private final String firstName;               // User first name 
    private final String lastName;               // User last name 
    private  String contactNumber;              // User contact number 
    private  String email;                     // User email 
    private final String userName;            // User username 
    private  String password;                // User password

    // This is a constructor for the user
    public User(int userId,  String firstName, String lastName, String contactNumber, String email, String userName, String password) {
        this.userId = userId ;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.email = email;
        this.userName = userName;
        this.password = password;  
    }

// Getters for user
public int getUserId() {
        return userId;
    }
public String getFirstName() {
        return firstName;
    }
public String getLastName() {
        return lastName;
    }
 public String getContactNumber() {
        return contactNumber;
    }
public String getEmail() {
        return email;
    }
public String getUserName() {
        return userName;
    }
public String getPassword() {
        return password;
    }

}
