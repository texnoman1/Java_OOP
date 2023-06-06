package HW3;



import java.math.BigDecimal;

/**
 * Абстрактный класс всех продуктов
 */
public abstract class Product implements Comparable<Product> {
    private String name;
    private long price;

    /**
     * Конструктор по умолчанию, без параметров
     */
    public Product() {
    }

    /**
     * Конструктор с двумя аргументами
     *
     * @param name  Наименование продукта
     * @param price Цена продукта
     */
    public Product(String name, long price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Получение наименования продукта
     *
     * @return наименование продукта
     */
    public String getName() {
        return name;
    }

    /**
     * Задание наименования продукта
     *
     * @param name наименование продукта
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получение цены продукта
     *
     * @return цена продукта
     */
    public long getPrice() {
        return price;
    }

    /**
     * Задание цены продукта с проверкой на корректность цены
     *
     * @param price цена продукта
     * */
     
    public void setPrice(long price) {
         this.price = price;
       
    }
    

    /**
     * Получение содержимого экземпляра объекта в читаемом виде
     *
     * @return наименование продукта и его стоимость;
     */
    @Override
    public String toString() {
        return "\"" + name + "\" стоит: " + price + " $ " ;
    }

    @Override    // имплементируется от итератора
    public int compareTo(Product o)   {
        if (this.price > o.price)
            return 1;
        else if (this.price < o.price)
            return -1;
        else
            return 0;
    }

    
}
