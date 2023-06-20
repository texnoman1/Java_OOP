package HW6;
/*- Создать класс Юзер и перенести его в базовые поля (ФИО) 
- Модифицировать ранее созданный класс СтудентКомпаратор  
- Переименовать в ЮзерКомпаратор - Типизировать его T наследующегося от типа Юзер 
- Типизировать реализуемый интерфейс Компаратор T 
- Изменить метод компаре, внеся во входные данные вместо конкретных классов типизацию T 
- Внести правки места, где использовался предыдущий компаратор */

/*- Создать класс Юзер и перенести его в базовые поля (ФИО) - Модифицировать ранее созданный класс СтудентКомпаратор - Переименовать в ЮзерКомпаратор - Типизировать его T наследующегося от типа Юзер - Типизировать реализуемый интерфейс Компаратор T - Изменить метод компаре, внеся во входные данные вместо конкретных классов типизацию T - Внести правки места, где использовался предыдущий компаратор */

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.TreeSet;
/*Взять реализованный код в рамках семинара 4 и продемонстрировать применение принципов, усвоенных на семинаре.
Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему. */



public class Main {
    public static void main(String[] args) {
        User oneUser = new User("Ян", "Янов", "Янович", LocalDate.now());
        User twoUser = new User("Петров", "Петр", "Петрович", LocalDate.now());
        User threeUser = new User("Сидоров", "Семен", "Петрович", LocalDate.now());

        TreeSet treeSet = new TreeSet(new UserComparator());
        treeSet.add(oneUser);
        treeSet.add(twoUser);
        treeSet.add(threeUser);

        System.out.println(treeSet);
    }
}
