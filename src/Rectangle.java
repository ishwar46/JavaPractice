public class Rectangle {

    private double width;
    private double height;

    Rectangle() {
        width = 5;
        height = 3;
    }

    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}
