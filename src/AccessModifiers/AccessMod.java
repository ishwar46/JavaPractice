package AccessModifiers;

public class AccessMod {
    public static void main(String[] args) {

        MyEmployee ishu = new MyEmployee();

        //ishu.id = 01;
        //ishu.name = "Ishu";

        ishu.setName("Ishwar Chaudhary");
        System.out.println(ishu.getName());

        ishu.setId(01);
        System.out.println(ishu.getId());
    }
}
