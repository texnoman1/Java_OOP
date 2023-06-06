package HW3;



import java.math.BigDecimal;

/**
 * Класс горячих напитков
 */
public class HotDrinks extends Drinkables {
    private int temp;

    /**
     * Перегруженный конструктор класса горячих напитков
     *
     * @param name   Наименование напитка
     * @param price  Цена напитка
     * @param d Объем напитка
     * @param temp   Температура напитка
     */
    public HotDrinks(String name, long price, double d, int temp) {
        super(name, price, d);
        this.temp = temp;
    }

    /**
     * Получение температуры напитка
     *
     * @return температуру напитка
     */
    public int getTemp() {
        return temp;
    }

    /**
     * Переопределенный метод
     *
     * @return наименование продукта, стоимость, объем и температуру.
     */
    @Override
    public String toString() {
        return super.toString() + "температура напитка = " + temp + "\n";
    }
}
