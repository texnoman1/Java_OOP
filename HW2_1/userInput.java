package HW2_1;


import java.util.*;
//метод для получения данных от пользователя

public class userInput  {             // геттер - передает  переменную А по вызову  метода
    public static int getA()  {
 
        System.out.println("Введите число 1 ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            return a;
    }

  

   public static char getOperation()  {       // геттер - передает  переменную etOperatio по вызову  метода !!! используем char  !!!
 
    System.out.println("Введите операцию + или - ");
        Scanner scanner = new Scanner(System.in);
        char operation = scanner.next().charAt(0);
        return operation;
}


   public static int getB()  {        // геттер - передает  переменную В по вызову  метода
 
    System.out.println("Введите число 2 ");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        return b;
   }
}


