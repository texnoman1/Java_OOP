package HW4;

import java.util.Iterator;
import java.util.List;

import HW3.ProductComparatorByPrice;

public class TeacherGroup implements Iterable<Student> {

    private List<Teacher> teacher;
    

    public TeacherGroup(List<Teacher> teacher) {
        
        this.teacher = teacher;
    }

    public List<Teacher> getTeacherGroup() {
        return teacher;
    }

    public void setTeachergroup(List<Teacher> teacher) {
        this.teacher = teacher;
    }
 
    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void sort(){         // 2 действие сортировки
        teacher.sort(new TeacherComparator<>());
        //activeGroup.sortByPrice();
    }

    /* public List<Student> getStudents() {
        return students;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }*/

    @Override
    public String toString() {
        return "StudentGroup{ teacher=" + teacher +'}';
    }

    @Override
    public Iterator<Student> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }

    public void add(Teacher oneTeacher) {
    } 
    
    public String getInfo(){   // вывод списка в метод мэйн
        StringBuilder stringBuilder = new StringBuilder();

//        Iterator<Student> iterator = activeGroup.iterator();
//        while (iterator.hasNext()){
//            Student student = iterator.next();
//            stringBuilder.append(student).append("\n");
//        }

        for (Teacher teacher: teacher){
            stringBuilder.append(teacher).append("\n");
        }
        return stringBuilder.toString();
    }
    
}
