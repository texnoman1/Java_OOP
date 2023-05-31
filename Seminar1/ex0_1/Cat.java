package Seminar1.ex0_1;

public class Cat{
    public Cat(String name, int age) { //это конструктор что бы мы могли создать котика и занести данные
        this.name = name;
        this.age = age;

    }    
    private String name; // private -доступ есть только внутри класса
    private int age;

    public int getAge() {  // геттер - метод служит для организации взаимодействия с полями класса
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { //check for null
       if (name == null) {
        System.out.println("name is null");
       } else {
        this.name = name;
    }  //?
    }



@Override //переопределение метода toString
public String toString() {
   return "Cat{" + "name'" + name + '\'' + ", age =" + age + '}';
    }
}