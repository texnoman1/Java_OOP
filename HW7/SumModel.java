package HW7;

public class SumModel extends CalcModel {

    public SumModel() {
        
    }
    // do_it
    @Override
    public double result() {
        //if (s == '+' ) {}
           return x + y; 
        
        
    }

    @Override
    public void setX(double value) {
        super.x = value;
    }

    @Override
    public void setY(double value) {
        super.y = value;
    }
    @Override
    public void setS(char value) {
        // TODO Auto-generated method stub
        super.s = s;
    }

}
