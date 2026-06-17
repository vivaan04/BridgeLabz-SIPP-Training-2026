
import java.util.Scanner;

public class ClimbingStairs {

    public static int climbStairs(int n,int a,int b) {
        if (n == 1) {
            return a;
        }
        if (n == 2) {
            return b;
        }
        return climbStairs(n-1,b,a+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int steps= sc.nextInt();
        System.out.println("Number of ways to climb " + steps + " stairs: " + climbStairs(steps, 1, 2));


        
        sc.close();
    }
}