package Assignments;

public class MainStudent {
    public static void main(String[] args) {


        Student John = new Student();
        Student Sam = new Student();

        John.name = "John Hero";
        John.rollno = 01;

        Sam.name = "Sam";
        Sam.rollno = 12;

        John.stdDetailsPrint();
        Sam.stdDetailsPrint();


    }
}
