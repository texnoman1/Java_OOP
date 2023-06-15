package HW5_1;



import HW5_1.model.Student;
import HW5_1.service.Service;
import HW5_1.view.View;

/*— Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;
— Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher, List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
— Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id) и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
— Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.*/


public class Main {
  public static void main(String[] args) {
   final View firstName;
   final View lastName; 
    Service f = new Service();
    View v = new View();
    System.out.println(v.getFirstName1());
    Student student1 = new Student(v.getFirstName1(), v.getLastName1(), 1);
    Student student2 = new Student("fff", "vvv", 1);

    System.out.println(student1);
    System.out.println(student2);
    f.createStudent();

  }  
}
