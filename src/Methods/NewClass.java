//Multiplication of n numbers
package Methods;

public class NewClass {

    static void multi(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d x %d = %d\n", n, i, n*i);
        }
    }

    static void pattern1(int n){
        for (int i=0; i<n;i++){
            for (int j=0; j<i+1;j++){
                System.out.println("*");
            }
            System.out.println();
        }
    }

    static int sumRect(int n){
        if(n==1){
            return 1;
        }
        return n + sumRect(n-1);
    }

    static void pattern2(int n){
        for (int i=n; i>0; i--){
            for (int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static int fib(int n){
        if(n==1){
            return 0;

        }
        else if (n==2){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        //Problem 1 Multiplication Table
        //multi(7);

        //Problem 2 Star Pattern
        //pattern1(5);

        //Problem 3 Recursive function sum first n natural number
        //int c = sumRect(5);
        //System.out.println(c);

        //Problem 4 Pattern Star Opposite
        //pattern2(5);

        // Problem 5: FIbonacci series nth term
        int result = fib(5);
        System.out.println(result);

    }
}
