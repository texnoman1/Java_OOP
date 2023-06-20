package Seminar4;

import java.time.LocalDate;
import java.util.TreeSet;

public class Service {
    public Service(){

    }

    public void RunIt(){
        Student oneUser = new Student("Ян", "Янов", "Янович", LocalDate.now());;
        Student twoUser = new Student("Петров", "Петр", "Петрович", LocalDate.now());
        Student threeUser = new Student("Сидоров", "Семен", "Петрович", LocalDate.now());

             

        TreeSet treeSet = new TreeSet(new UserComparator());
        treeSet.add(oneUser);
        treeSet.add(twoUser);
        treeSet.add(threeUser);

        

        System.out.println(treeSet); 
    } 
}
