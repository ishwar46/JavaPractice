package ClassAndObject;

public class Employee {
    int id;
    String name;
    int salary;
    public void printDetails(){

        System.out.println("My id is "+ id);
        System.out.println("and my name is "+name);
        System.out.println("my montly salary is Rs."+salary);

    }

    public int getSalary(){
        return salary;
    }

    public void getDetails(){

    }

}
