package Seminar1.ex0_2;

public class Dog extends Animal {    //extends наследование ot Animal

    @Override   //переопределение метода voicе - это пример полиморфизма
    public void voice() {
        System.out.println("i am a dog");
    }      
    
}
