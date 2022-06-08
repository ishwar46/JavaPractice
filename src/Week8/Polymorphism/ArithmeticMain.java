package Week8.Polymorphism;

public class ArithmeticMain {
    public static void main(String[] args) {

        Calculation cal = new Calculation();
        cal.add(2,4);
        cal.sub(3,7);
        cal.div(5,9);
        cal.mul(5,3);

        Arithmetic arth = new Arithmetic();
        arth.add(2,4);
        arth.sub(3,7);
        arth.div(5,9);
        arth.mul(5,3);
    }
}
