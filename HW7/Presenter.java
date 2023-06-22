package HW7;

public class Presenter {
    View view;    // уровень абстракции, какая то модель наперед неизвестная
    Model model;  // и какойто вью наперед неизвестный

    public Presenter(Model m, View v) {  //  в конструкторе принимаем уже конкретный вью и конкретную модель
        model = m;
        view = v;
    }

    public void buttonClick(){
        double a = view.getValue("a: ");
        double b = view.getValue("b: ");
        char s = view.getSign("enter operation you want (+, -, :, *): ");
        model.setX(a); //связь вьюхи и модели
        model.setY(b);
        model.setS(s);
        double result = model.result();
        //double result1 = SumModel.result();
        view.print(result, "Sum: ");
    }
}
