package HW7;

public class PresenterOfT<T extends CalcModel> {
 

    View view;
    Model model;

    public PresenterOfT(T m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        double a = view.getValue("a: ");
        double b = view.getValue("b: ");
        char s = view.getSign("enter operation you want (+, -, :, *): ");
        model.setX(a);
        model.setS(s);
        model.setY(b);
        double result = model.result();
        view.print(result, "Sum: ");
    }
}
