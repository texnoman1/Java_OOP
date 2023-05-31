package Seminar1.ex1_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class VendingMachine {
    private LinkedList<Product> products;

    public VendingMachine() {
        this.products = new LinkedList<>();
    }

    public void putProduct(LinkedList<Product> item) {
        this.products = item;
    }

    public Product getProduct() {
        return this.products.getLast();
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "products=" + products +
                '}';
    }
}
