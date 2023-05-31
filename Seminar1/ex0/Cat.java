package Seminar1.ex0;

public class Cat{
    public Cat(String name, int age) { //это конструктор что бы мы могли создать котика и занести данные
        this.name = name;
        this.age = age;

    }    
    String name;
    int age;



@Override //переопределение метода toString
public String toString() {
   return "Cat{" + "name'" + name + '\'' + ", age =" + age + '}';
    }
}