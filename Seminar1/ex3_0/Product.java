package Seminar1.ex3_0;
/*Задача 3 - Наследование
📌 Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды),
сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа
ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)*/

public abstract class Product {
    // Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
    // содержащий
    // в себе методы initProducts (List <Product>) сохраняющий в себе список
    // исходных продуктов и
    // getProduct(String name)

    protected String name;
    protected int price;

    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getPrice();

    public abstract void setPrice(int price);
}
