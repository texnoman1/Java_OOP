package Seminar1.ex1_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,  содержащий
    // в себе методы initProducts (List <Product>) сохраняющий в себе список
    // исходных продуктов и  getProduct(String name)

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
