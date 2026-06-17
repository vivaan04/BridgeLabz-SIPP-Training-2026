/*
Question 1:
Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors. Also find the sum, sum of square of factors and product of the factors and display the results.
*/
import java.util.Scanner;

public class FactorsAnalysis {
    public static int[] findFactors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) count++;
        }
        int[] factors=new int[count];
        int index=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) factors[index++]=i;
        }
        return factors;
    }

    public static int findSum(int[] factors){
        int sum=0;
        for(int f:factors) sum+=f;
        return sum;
    }

    public static long findProduct(int[] factors){
        long product=1;
        for(int f:factors) product*=f;
        return product;
    }

    public static double findSumOfSquares(int[] factors){
        double sum=0;
        for(int f:factors) sum+=Math.pow(f,2);
        return sum;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] factors=findFactors(n);

        System.out.print("Factors: ");
        for(int f:factors){
            System.out.print(f+" ");
        }

        System.out.println("\nSum: "+findSum(factors));
        System.out.println("Product: "+findProduct(factors));
        System.out.println("Sum of Squares: "+findSumOfSquares(factors));
    }
}