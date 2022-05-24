package ClassAndObject;

public class ClassAndObj {
    public static void main(String[] args) {
        System.out.println("Custom Class");
        Employee ishu = new Employee();
        Employee sam = new Employee();

        //Setting Attributes
        ishu.id = 11;
        ishu.name = "Ishwar";
        ishu.salary = 32000;

        sam.id = 7;
        sam.name = "Samikshya";
        sam.salary = 42000;
        //Printing the Attributes
        ishu.printDetails();
        sam.printDetails();
        int salary = sam.getSalary();
        ishu.getDetails();
        System.out.println(salary);
        //System.out.println(ishu.id);
        //System.out.println(ishu.name);


    }
}
