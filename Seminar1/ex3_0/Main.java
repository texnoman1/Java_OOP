package Seminar1.ex3_0;

import java.util.LinkedList;

public class Main {
   public static void main(String[] args) {
    
    VendingMachine vm = new VendingMachine();

    Product water1 = new Water("BonAcva", 50);
    Product water2 = new Water("AcvaMineral", 50);
    LinkedList<Product> l = new LinkedList<>();

    l.add(water1);
    l.add(water1);

    vm.putProduct(l);

   } 
}
