package HW5_1.model;

public class User {

    String firstName;
    String lastName;
   


    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

     public String getLastName() {
        return lastName;
    }
    
}
