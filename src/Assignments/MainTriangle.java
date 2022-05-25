package Assignments;

public class MainTriangle {

    public static void main(String[] args) {

        Triangle tri = new Triangle();


        tri.setBreadth();
        tri.setLength();
        tri.setHeight();

        System.out.println("Perimeter of triangle: " +tri.perimeter());
        System.out.println("Area of triangle: " +tri.area());

    }
}
