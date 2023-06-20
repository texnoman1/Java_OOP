package HW6;


import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;

/*- Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов, усвоенных на семинаре.
Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему. */

/* ЗАДАНИЕ 6:

1 Сделал класс User абстрактным, от него наследуются классы Student, Teacher -  O(Open Closed Principle) - принцип открытости/закрытости - программные сущности открыты для расширения и закрыты для модификации. 
Чтобы не сломать логику в классе-родителе, мы унаследуемся от него и реализуем что-то своё, и используем свой класс. 
   2 Teacherв этом задании не используется, поэтому удалил все, что связано с Teacher в классе StudentGroup - противоречит S(Single Responsibility Principle) 
   - принцип единственной ответственности - каждый класс выполняет лишь одну задачу.    
   3  Создание Юзеров заменено на создание Студентов и вынесено вместе с созданием treeSet в класс Сервис.
Что еще по хорошему нужно сделать
   4 Создать вьюшку и получать в ней с помощью сканера данные Студента, выводить тоже через нее
   5 Использовать класс СтудентГрупп для создания группы студентов(на семинаре почему то так не сделали) 
   надеюсь сделать это в Задании7 Калькулятор.

    класс StudentGroupIterator соответствует принципу единственной ответственности.  Для него определено единственное назначение - итерировать объекты класса Student.
    класс User соответствует принципу инверсий зависимостей.  От этого класса зависят Student и Teacher, а он от них не зависит.

   */

public class Main {
    public static void main(String[] args) {
        /*Student oneUser = new Student("Ян", "Янов", "Янович", LocalDate.now());;
        Student twoUser = new Student("Петров", "Петр", "Петрович", LocalDate.now());
        Student threeUser = new Student("Сидоров", "Семен", "Петрович", LocalDate.now());            

        TreeSet treeSet = new TreeSet(new UserComparator());
        treeSet.add(oneUser);
        treeSet.add(twoUser);
        treeSet.add(threeUser);        

        System.out.println(treeSet);*/

        Service service = new Service();
        service.RunIt();
    }
}
