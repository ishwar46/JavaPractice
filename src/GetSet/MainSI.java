package GetSet;

import Constructor.SimpleInt;

import java.util.Scanner;

public class MainSI {

    public static void main(String[] args) {
        double p = 0;
        double t = 0;
        double r = 0;

        SI SI = new SI(p, t, r);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle: ");
        p = sc.nextDouble();

        System.out.println("Enter rate: ");
        r = sc.nextDouble();

        System.out.println("Enter time: ");
        t = sc.nextDouble();

        System.out.println(SI.SimpleInterest());
    }
}
