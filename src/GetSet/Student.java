package GetSet;

public class Student {

    private String name;
    private int age;

    private String phone;

    private String email;


    public String getName(){
        return name;
    }

    public String getPhone(){
        return phone;
    }

    public String getEmail(){
        return email;
    }

    public int getAge(){
        return age;
    }


    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    void setPhone(String phone){
        this.phone=phone;
    }

    void setEmail(String email){
        this.email=email;
    }




}
