package HW2_1;

public class Calc {
    
    
    private int a;
    private int b;
    private double result;
    private char operation;  // определяем переменные

    public void getResults() {     // выводим результат
		System.out.println(result);
    }

    public void setA(int a) {     // принимаем А
		this.a = a;
	}

    public void setB(int b) {   // Принимаем В
		this.b = b;
	}
    
    public void setOperation(char operation) {     // Принимаем знак операции и проверяем его
		if (operation == '+' || operation == '-' ) {
			this.operation = operation;
		}
		else {
			System.out.println("Operation not valid");
		}
	}

	public void getOperation() {     // выводим знак операции по запросу
		System.out.println(operation);
	}
    
    public void performOperation() {  // логика калькулятора
		if (operation == '+') {
			result = a + b;
		}
		if (operation == '-') {
			result = a - b;
		}	
    }
}


