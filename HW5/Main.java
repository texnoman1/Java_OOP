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
        Teacher sensei = new Teacher("Van Li", 1968, Disciples.PROGRAMMING);

        Student katya = new Student("Katya jafsjfajjvna", 1999);
        Student vasya = new Student("Vasya afahahfvich", 1985);
        Student kirill = new Student("Kirill Zoomovich", 1932);

        List<Student> list = new ArrayList<>(Arrays.asList(katya, vasya, kirill));

        controller.create(list,sensei);
        controller.read();
    }
}