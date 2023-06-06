package Seminar3;

//import students.StudyGroupItem;
//import students.student.Student;

import java.util.Comparator;

public class StudentComparatorByName<T extends StudyGroupItem> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
