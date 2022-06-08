package Week8.Polymorphism;

public class Calculation extends Arithmetic {

    @Override
    void add(int a, int b) {
        System.out.println(a-b);
    }

    @Override
    void sub(int a, int b) {
        System.out.println(a+b);
    }

    @Override
    void mul(int a, int b) {
        System.out.println(a/b);
    }

    @Override
    void div(int a, int b) {
        System.out.println(a*b);
    }
}
