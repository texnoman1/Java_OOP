public class Presenter {
    View view;    // уровень абстракции, какая то модель наперед неизвестная
    Calc calc;  // и какойто вью наперед неизвестный

    public Presenter(Calc c, View v) {  //  в конструкторе принимаем уже конкретный вью и конкретную модель
        calc = c;
        view = v;
    }

    public void buttonClick(){
        double a = view.getValue("enter number a: ");
        char s = view.getSign("enter operation you want (+, -, /, *): ");
        double b = view.getValue("enter number b: ");
        
        
        if (s == '+')  {
			Addition add = new Addition(a, b, s);
            add.performOperation();
		}
		if ( s == '/') {
            Division div = new Division(a, b, s) ;
			if (b == 0) {
				System.out.println("Zero devision");        
			}
            div.performOperation();
			
		}	
		if ( s == '*')  {
            Multiplication mult = new Multiplication(a, b, s);
            mult.performOperation();
			
		}	
		if (s == '-') {
		Substraction sub = new Substraction(a, b, s);
        sub.performOperation();
		}	
        
    }
}
