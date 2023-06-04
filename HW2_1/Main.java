package HW2_1;

/*Написать калькулятор в ООП стиле(инкапсуляция, наследованеи. полиморфизм) */

public class Main {
    public static void main(String[] args) {
       
    userInput userinput = new userInput(); //создаем экземпляр класса userInput
    
 

    Calc calc1 = new Calc();   //создаем экземпляр класса Calc
    
    calc1.setA(userinput.getA()); // передаём переменную А из класса Calc в метод calc1.setA класса Calc
    
    
    
    calc1.setOperation(userinput.getOperation()); // передаём переменную Operation из класса Calc в метод setOperation класса Calc

    calc1.setB(userinput.getB()); // передаём переменную В из класса Calc в метод calc1.setВ класса Calc
    
    calc1.performOperation(); // вызываем метод erformOperation
    
    calc1.getResults(); // вызываем метод erformOperation getResults

    }
}
