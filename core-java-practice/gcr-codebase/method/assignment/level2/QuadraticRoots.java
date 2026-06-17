/*
Question 11:
Write a program Quadratic to find the roots of the equation using Math.pow() and Math.sqrt().
*/
import java.util.Scanner;

public class QuadraticRoots {

    public static double[] findRoots(double a,double b,double c){
        double d=Math.pow(b,2)-4*a*c;

        if(d>0){
            return new double[]{
                (-b+Math.sqrt(d))/(2*a),
                (-b-Math.sqrt(d))/(2*a)
            };
        }
        else if(d==0){
            return new double[]{
                -b/(2*a)
            };
        }

        return new double[0];
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();

        double[] roots=findRoots(a,b,c);

        if(roots.length==0)
            System.out.println("No Real Roots");
        else{
            for(double r:roots){
                System.out.println(r);
            }
        }
    }
}