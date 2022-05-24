package ClassAndObject.PracticeSet;

public class QuestionThree {
    public static void main(String[] args) {

        Square sq = new Square();
        sq.side = 3;

        sq.area();
        sq.perimeter();

        System.out.println("Area of Perimegter is: " +sq.area());
        System.out.println("Perimeter of Square is: " +sq.perimeter());



    }
}
