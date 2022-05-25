package Assignments;

public class Triangle {
    int length;
    int breadth;
    int height ;

    public int area(){
        return (breadth*height)/2;
    }

    public int perimeter(){

        return length*breadth*height;
    }

    public void setLength(){
        length = 3;

    }
    public void setBreadth(){
        breadth = 4;

    }
    public void setHeight(){
        height = 5;
    }
}
