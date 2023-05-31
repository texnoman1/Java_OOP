package Seminar1.ex0_2;
// ИНКАПСУЛЧЦИЯ
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat(null, 0);
        Animal dog = new Dog();
        animal.voice();
        cat.voice();
        dog.voice();

    }
    
}
