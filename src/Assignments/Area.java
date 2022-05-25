package Assignments;

/*Write a program to print the area of a rectangle by creating a class
named ‘Area’ having two methods.
The first method named ‘setDim’ takes length and breadth of the
rectangle as parameters and the second method named as getArea
Returns the area of rectangle. Length and breadth of rectangle are
entered through keyboard.*/

import java.util.Scanner;

public class Area {

    int length;
    int breadth;
    int width;

    public int setDim(){

        return length*breadth;
    }

    public int getArea(){

        return length*breadth;
    }

    public void setLength(){

      length = 2;


    }
    public void setBreadth(){
        breadth = 3;

    }






}
