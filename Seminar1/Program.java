import java.util.ArrayList;
import java.util.List;


// Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
    // содержащий
    // в себе методы initProducts (List <Product>) сохраняющий в себе список
    // исходных продуктов и
    // getProduct(String name)

public class Program {
    public static void main(String[] args) {
        Product apple = new Product("apple", 20);
        //System.out.println(apple);

        List<Product> products = new ArrayList<>();
        products.add(apple);

        VendingMachine vendingMachine = new VendingMachine();      


        vendingMachine.putProduct(products);

        //System.out.println(vendingMachine.putProduct((LinkedList<Product>) products).toString());
        System.out.println(vendingMachine.getProduct("apple").toString());
        


    }
}
