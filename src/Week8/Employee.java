package Week8;

//WAP to create a class named Employee where you have to add data members like
//name, desig, monthlysalary, address,
//here you have to perform encapculation with data hiding and calculate the net
// salary of the employee with respect to the task amount as
//if annual salary is less than 200000 ->15%
//if annual salary is less than 400000 ->20%
//if annual salary is less than 200000 ->30%


public class Employee {

    private String name;
    private String designation;
    private int monthlySalary;
    private String address;

    public void setMonthlysalary(double monthlysalary){
        if (monthlysalary >=0){
            this.monthlySalary= (int) monthlysalary;
        }
    }

    boolean calculateNetSalary(){
        double AnnualSalary = monthlySalary*12;
        double NetSalary,pf;
        pf=(AnnualSalary % 25);
        NetSalary = AnnualSalary - pf;
        System.out.println(NetSalary);
        return false;
    }
    public String getName(){
        return name;
    }

    public String getDesignation(){
        return designation;
    }

    public double getMonthlySalary(){
        return monthlySalary;
    }


    public String getAddress(){
        return address;
    }

    public void setName(String name){
        name = "Ishu";
    }

    public void setDesignation(String designation){
        designation = "CEO";
    }

    public void setAddress(String address){
        this.address = "Kathmandu";
    }

}

