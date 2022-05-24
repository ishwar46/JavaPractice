package AccessModifiers;

class StdDetails {

    private int id;
    private String name;
    int roll;
    String Address;

    public void setName(String n){
        this.name = n;
    }

    public void setId(int i){
        this.id = i;
    }

    public void studentDetailsPrint(){
        System.out.println("Student id is: " +id);
        System.out.println("Student name is: "+name);
        System.out.println("Student roll number is: "+roll);
        System.out.println("Student address is: "+Address);
    }
}
