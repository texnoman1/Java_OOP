package HW2;

public class Calc {
    
    
    private int a;
    private int b;
    private double result;
    private char operation;

    public void getResults() {
		System.out.println(result);
    }

    public void setA(int a) {
		this.a = a;
	}

    public void setB(int b) {
		this.b = b;
	}
    
    public void setOperation(char operation) {
		//if (operation == "+" || operation == "-" ) {
			this.operation = operation;
		//}
		//else {
		//	System.out.println("Operation not valid");
		//}
	}
    public void getOperation() {
		
        System.out.println(operation);
    }
    public void performOperation() {
		if (operation == '+') {
			result = a + b;
		}
		if (operation == '-') {
			result = a - b;
		}	
    }
}


