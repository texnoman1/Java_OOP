package Seminar1.ex0;
// ИНКАПСУЛЧЦИЯ
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("barsik", 7);
        System.out.println(cat);

        cat.name = "pushok";
        System.out.println(cat);

    }
    
}
