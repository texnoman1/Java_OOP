package HW5_1.service;

import java.util.List;

import HW5_1.model.Student;
import HW5_1.view.View;
import model.Teacher;

public class Service {
   private View firstName1;
   private View lastName1;
   Student student;
   View view;
   View view1;

   public Service( ) {
        
    }

   public void create() {
        
        this.student = student;
   }

   
   public void createStudent() {
    Student student1 = new Student("gtnz _", " ", 1);
    System.out.println(student1);
   }

   
    @Override
    public String toString() {
        return firstName1 + " " + lastName1 ;
    }

 
}
