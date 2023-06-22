

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextDouble();
    }

    public char getSign(String title) {
        System.out.printf("%s", title);
        return in.next().charAt(0);       // for char
    }

     //print(f'{title} = {data}')
    public void print(double result, char s, double a, double b) {
        System.out.printf("%s %s %s %s %s",a, s, b, "=", result); //%f - for double, %d - is used for integer
    }
    
}
