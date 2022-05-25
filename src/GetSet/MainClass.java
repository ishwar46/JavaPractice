package GetSet;

public class MainClass {
    public static void main(String[] args) {

        Student std = new Student();
        std.setName("Student");
        std.setAge(13);
        std.setEmail("coolishu@hotmail.com");
        std.setPhone("9804000000");

        System.out.println(std.getName());
        System.out.println(std.getAge());
        System.out.println(std.getPhone());
        System.out.println(std.getEmail());


    }
}
