package Week8;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Employee employee = new Employee();
            employee.setMonthlysalary(sc.nextDouble());
            System.out.println(employee.getName());
            System.out.println(employee.getDesignation());
            System.out.println(employee.getMonthlySalary());
            System.out.println(employee.getAddress());
            System.out.println();
            Employee emp=new Employee();
            System.out.println(emp.calculateNetSalary());

    }
}
