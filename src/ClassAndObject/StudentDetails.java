package ClassAndObject;

public class StudentDetails {


    public static void main(String[] args) {

        StdDetails ishu = new StdDetails();
        StdDetails sam = new StdDetails();


        ishu.id = 1;
        ishu.name = "Ishwar";
        ishu.roll = 12;
        ishu.Address = "Kathmandu";

        sam.id = 2;
        sam.name = "Samikshya";
        sam.roll = 7;
        sam.Address = "Missouri";

        ishu.studentDetailsPrint();
        sam.studentDetailsPrint();

    }
}
