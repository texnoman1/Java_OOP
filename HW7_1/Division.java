


public class Division extends Calc {
    private double a; 
    private double b;
    private char s;
    private double result;
    View view = new View();
    

      
    
    public Division(double a, double b, char s){
    this.a = a;
    this.b = b;
    this.s = s;
    }    

    @Override
    public void performOperation() {
        result = a / b;                
        view.print(result, s, a, b);
        
    }
}
