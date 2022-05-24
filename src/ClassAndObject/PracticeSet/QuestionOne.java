package ClassAndObject.PracticeSet;

public class QuestionOne {
    public static void main(String[] args) {
        NewEmployee ishu = new NewEmployee();
        ishu.setName("Ishwar Chaudhary");
        ishu.salary = 23333;
        System.out.println(ishu.getName());
        System.out.println("Salary is" +ishu.getSalary());
    }
}
