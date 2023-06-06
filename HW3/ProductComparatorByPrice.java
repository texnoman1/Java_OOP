package HW3;

import java.math.BigDecimal;

//import students.StudyGroupItem;
//import students.student.Student;

import java.util.Comparator;

public class ProductComparatorByPrice implements Comparator<Product> {   // 3 действие по выстраиванию по цене  ссылается на компаратор
    @Override
    public int compare(Product o1, Product o2) {
        return Long.compare(o1.getPrice(), o2.getPrice());
    }

    
}
