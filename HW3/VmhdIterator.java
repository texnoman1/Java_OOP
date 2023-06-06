package HW3;

//import students.student.Student;

import java.util.Iterator;
import java.util.List;

public class VmhdIterator<E> implements Iterator<E> {
    private int index;
    private List<E> productList;

    public VmhdIterator(List<E> productList) {
        this.productList = productList;
    }

    @Override
    public boolean hasNext() {
        return index < productList.size();
    }

    @Override
    public E next() {
        return productList.get(index++);
    }

    

    
}
