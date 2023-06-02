package HW1_1;

/*Урок 1. Принципы ООП: Инкапсуляция, наследование, полиморфизм
    Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
    Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод 
    getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
    В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, 
    заложенную в программе
    Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре */


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        

        System.out.println("Ваш горячий напиток");
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Coffee", new BigDecimal(3), 0.3, 90),
                new HotDrinks("Tea", new BigDecimal(1), 0.4, 80),
                new HotDrinks("Milk", new BigDecimal(3), 1.0, 50)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Вводим название - Tea: " + vmHotDrinks.getProduct("Tea"));
        System.out.println("Вводим цену - 2,5$: " + vmHotDrinks.getProduct(new BigDecimal(2.5)));
        System.out.println("Вводим температуру - +90С: " + vmHotDrinks.getProduct(50));
    }

    
}
