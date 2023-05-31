package Seminar1.ex0_1;
// ИНКАПСУЛЧЦИЯ
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("barsik", 7);
        
        System.out.println(cat.getName()); //обращаемся к полю через гетресеттер
        System.out.println(cat.getAge());
       
        System.out.println(cat);

        cat.setName(null);
        System.out.println(cat);

    }
    
}
