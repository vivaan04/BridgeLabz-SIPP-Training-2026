public class Factorial {

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int factorialTail(int n,int accumulator){
        if(n==0){
            return accumulator;
        }
        return factorialTail(n-1,accumulator*n);
    }

    public static void main(String[] args){
        int number=5;
        System.out.println("Factorial of "+number+" is: "+factorial(number));
        System.out.println("Factorial of "+number+" is: "+factorialTail(number,1));
    }
}