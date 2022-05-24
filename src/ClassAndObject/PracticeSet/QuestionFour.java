package ClassAndObject.PracticeSet;

public class QuestionFour {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle();

        /*rect.length = 2;
        rect.breadth = 4;
        rect.width = 5;*/

        rect.area();
        rect.perimeter();

        rect.setBreadth();
        rect.setWidth();
        rect.setLength();

        System.out.println("Area of rectangle is: " +rect.area());
        System.out.println("Perimeter of rectangle is: " +rect.perimeter());



    }
}
