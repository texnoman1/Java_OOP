package Seminar3;

//import students.student.Student;
//import students.studentGroup.StudyGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Service {
    private int id;
    private StudyGroup<Student> activeGroup;
    private List<StudyGroup> studyGroupList;

    public Service(StudyGroup group) {
        this.activeGroup = group;
        studyGroupList = new ArrayList<>();
        studyGroupList.add(group);
    }

    public Service(){
        this(new StudyGroup());
    }

    public void addStudentGroup(StudyGroup studyGroup){
        studyGroupList.add(studyGroup);
    }

    public void addStudent(String name, int age){
        activeGroup.addStudent(new Student(id++, name, age));
    }

    public String getInfo(){
        StringBuilder stringBuilder = new StringBuilder();

//        Iterator<Student> iterator = activeGroup.iterator();
//        while (iterator.hasNext()){
//            Student student = iterator.next();
//            stringBuilder.append(student).append("\n");
//        }

        for (Student student: activeGroup){
            stringBuilder.append(student).append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName(){
        activeGroup.sortByName();
    }

    public void sortByAge(){
        activeGroup.sortByAge();
    }
}
