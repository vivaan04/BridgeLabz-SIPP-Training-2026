/*
Question 2:
Write a program to find the sum of n natural numbers using recursive method and compare the result with the formula n*(n+1)/2.
*/
import java.util.Scanner;

public class RecursiveNaturalSum {

    public static int recursiveSum(int n){
        if(n==1) return 1;
        return n+recursiveSum(n-1);
    }

    public static int formulaSum(int n){
        return n*(n+1)/2;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n<=0){
            System.out.println("Not a Natural Number");
            return;
        }

        int recursive=recursiveSum(n);
        int formula=formulaSum(n);

        System.out.println("Recursive Sum: "+recursive);
        System.out.println("Formula Sum: "+formula);

        if(recursive==formula)
            System.out.println("Both Results are Correct");
    }
}