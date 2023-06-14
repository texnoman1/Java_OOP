package HW5_1.model;

import model.Disciples;

public class Teacher extends User {
    static Integer idGenerator = 0;    
    private int idTeacher;
public Teacher(String firstName, String lastName, Integer idTeacher ) {
        super(firstName, lastName);
        this.idTeacher = idTeacher;
        this.idTeacher = idGenerator++;
    }

}
