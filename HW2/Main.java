package HW2;
import java.util.*;

import HW2_1.userInput;
public class Main {
    public static void main(String[] args) {
    
        

    System.out.println("Введите число 1 ");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();

    System.out.println("Введите операцию + или - ");
    Scanner scanner1 = new Scanner(System.in);
    char operation = scanner1.next().charAt(0);
    //System.out.println(operation);  
    
    System.out.println("Введите число 2 ");
    Scanner scanner2 = new Scanner(System.in);
    int b = scanner2.nextInt();
    
    Calc calc1 = new Calc();
    calc1.setA(a);
    calc1.setB(b);
    
    calc1.setOperation(operation); 
    //calc1.getOperation();
    
    calc1.performOperation();
    
    calc1.getResults();

    }
}
