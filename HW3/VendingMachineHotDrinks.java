package HW3;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс автомата горячих напитков
 */
public class VendingMachineHotDrinks implements VendingMachine  {
    List<HotDrinks> hotDrinksList = new ArrayList<>();
    List<HotDrinks> resultFind = new ArrayList<>();

    /**
     * Переопределенный метод интерфейса VendingMachine
     */
    @Override
    public void initProduct() {
    }

    /**
     * Перегруженный метод
     *
     * @param list лист объектов класса hotDrinks
     */
    public void initProduct(List<HotDrinks> list) {
        this.hotDrinksList = list;
    }

    /**
     * Переопределенный метод
     *
     * @return null
     */
    @Override
    public String getProduct() {
        return null;
    }
   
    

    public String getProduct1() {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            resultFind.add(el);   
        }
        return resultFind.toString();
    }

    public String getInfo(){   // вывод списка в метод мэйн
        StringBuilder stringBuilder = new StringBuilder();

//        Iterator<Student> iterator = activeGroup.iterator();
//        while (iterator.hasNext()){
//            Student student = iterator.next();
//            stringBuilder.append(student).append("\n");
//        }

        for (Product product: hotDrinksList){
            stringBuilder.append(product).append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByPrice(){         // 2 действие сортировки
        hotDrinksList.sort(new ProductComparatorByPrice());
        //activeGroup.sortByPrice();
    }

    

    
}
