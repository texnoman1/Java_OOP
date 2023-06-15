import controller.Controller;
import model.Disciples;
import model.Student;
import model.Teacher;
import service.DataServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*— Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;
— Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher, List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
— Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
— Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.*/

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Teacher teacher = new Teacher("Александр Иванов", 1968, Disciples.PROGRAMMING);

        Student student1 = new Student("Марина Ильина", 1999);
        Student student2 = new Student("Василий Петров", 1985);
        Student student3 = new Student("Кирилл Сидоров", 1932);

        List<Student> list = new ArrayList<>(Arrays.asList(student1, student2, student3));

        controller.create(list, teacher);
        controller.read();
    }
}