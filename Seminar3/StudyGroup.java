package Seminar3;

/*import students.Service;
import students.StudyGroupItem;
import students.student.Student;
import students.student.comparators.StudentComparatorByAge;
import students.student.comparators.StudentComparatorByName;
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup<E extends StudyGroupItem> implements Iterable<E>{
    private List<E> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(E student){
        studentList.add(student);
    }

    @Override
    public Iterator<E> iterator() {
        return new StudentIterator<>(studentList);
    }

    public void sortByName(){
        studentList.sort(new StudentComparatorByName<>());
    }

    public void sortByAge(){
        studentList.sort(new StudentComparatorByAge<>());
    }
}
