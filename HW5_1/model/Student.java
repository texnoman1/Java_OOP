package HW5_1.model;

public class Student extends User {
     static Integer idGenerator = 0;    
     private int idStudent;
public Student( String firstName, String lastName, Integer idStudent) {
        super(firstName, lastName);
        this.idStudent= idStudent;
        this.idStudent = idGenerator++;
    }

    

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + idStudent;
    }
    
}
