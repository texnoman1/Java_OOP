package HW7;

import java.util.Scanner;

public class View {
    Scanner in = new Scanner(System.in);

    public double getValue(String title) {
        System.out.printf("%s", title);
        return in.nextInt();
    }

    public char getSign(String title) {
        System.out.printf("%s", title);
        return in.next().charAt(0);       // for char
    }

    // print(f'{title} = {data}')
    public void print(double data, String title) {
        System.out.printf("%s %f\n", title, data); //%f - for double, %d - is used for integer
    }
}
