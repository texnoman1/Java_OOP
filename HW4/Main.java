package HW4;

/* */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/*Модифицировать учительский класс и связанные с ним, добавив типизацию(Добавить iterator + comparator + teacherGroup) */

public class Main {
    public static void main(String[] args) {
        /*User oneUser = new User("Ян", "Янов", "Янович", LocalDate.now());
        User twoUser = new User("Петров", "Петр", "Петрович", LocalDate.now());
        User threeUser = new User("Сидоров", "Семен", "Петрович", LocalDate.now());

        TreeSet treeSet = new TreeSet(new UserComparator());
        treeSet.add(oneUser);
        treeSet.add(twoUser);
        treeSet.add(threeUser);

        System.out.println(treeSet);*/   // 0 Вывод семинара

        Teacher oneTeacher = new Teacher("Якубович", "Ян", "Янович", LocalDate.now()) ;
        Teacher twoTeacher = new Teacher("Сидоров ", "Семен", "Семенович", LocalDate.now()) ;
        Teacher threeTeacher = new Teacher("Петров", "Петр", "Петрович", LocalDate.now()) ;

        TreeSet treeSet1 = new TreeSet(new UserComparator());
        treeSet1.add(oneTeacher);
        treeSet1.add(twoTeacher);
        treeSet1.add(threeTeacher);

        //System.out.println(treeSet1); //1 Сделано по анологии с семинаром

        TeacherGroup teachgroup = new TeacherGroup(null);

        List<Teacher> list = new ArrayList<>();
        list.add(oneTeacher);
        list.add(twoTeacher);
        list.add(threeTeacher);        
        
        teachgroup.setTeachergroup(list);
        System.out.println(teachgroup.getInfo()); // Без сортировки
        teachgroup.sort();

        //System.out.println(teachgroup.getTeacherGroup()); // 2 Вывод согласно заданию через TeacherGroup
        System.out.println(teachgroup.getInfo()); // 3 покрасившее через StrinBuilder))) с сортировкой


        

    }
}
