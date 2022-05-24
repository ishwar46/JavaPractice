package ClassAndObject.PracticeSet;

public class Rectangle {

    int length;
    int breadth;

    int width;

    public int area(){
        return length*breadth;
    }

    public int perimeter(){
        return 2*(length+width);
    }

    public void setLength(){
        length = 2;

    }
    public void setBreadth(){
        breadth = 3;

    }
    public void setWidth(){
        width = 5;

    }

}
