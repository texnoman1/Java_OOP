package Seminar1.ex1_2;

public class Product {
    // Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
    // содержащий
    // в себе методы initProducts (List <Product>) сохраняющий в себе список
    // исходных продуктов и
    // getProduct(String name)

    private String name;
    private int price;

    public String getName() {
        return name;
    }    

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

