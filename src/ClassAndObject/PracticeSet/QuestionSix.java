package ClassAndObject.PracticeSet;

public class QuestionSix {

    public static void main(String[] args) {


        Circle cir = new Circle();

        cir.pi = 3.14;
        cir.r = 3;

        //cir.area();
        //cir.perimeter();

        System.out.println("The area of circe is: " +cir.area());
        System.out.println("The perimeter of a circle is: " +cir.perimeter());

    }
}
