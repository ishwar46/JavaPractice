package Assignments;

import java.util.Scanner;

public class Main_Area {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Area rect = new Area();
        /*System.out.println("Enter the length: ");
        length = sc.nextInt();

        System.out.println("Enter the breadth: ");
        breadth = sc.nextInt();*/

        rect.setBreadth();
        rect.setLength();


        System.out.println("Area of rectangle is: " +rect.getArea());



    }
}
