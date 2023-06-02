package Seminar1.ex3_0;

/*Задача 3 - Наследование
📌 Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: БутылкаВоды),
сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа
ТорговогоАвтомата (пример: ПродающийБутылкиВодыАвтомат)*/

public class Water extends Product {

    @Override
    public String getName() {
        return super.name;
    }

    public Water(String name, int price) {
        super.name = name;
        super.price = price;
    }

    @Override
    public String toString() {
        return "Water{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public int getPrice() {
        return super.price;
    }

    @Override
    public void setPrice(int price) {
        super.price = price;
    }
}


