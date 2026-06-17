// Build a 'Math Wizard' utility class: isPrime(n), factorial(n) using
// iteration, fibonacci(n), gcd(a,b), lcm(a,b), and power(base, exp).
// Overload factorial to also accept double. Demonstrate scope
// differences between local and instance variables.
public class MathWizard {
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
    public int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public double factorial(double n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public double power(double base, int exp) {
        return powerHelper(base, exp, 1);
    }

    private double powerHelper(double base, int exp, double accumulator) {
        if (exp == 0) {
            return accumulator;
        }
        return powerHelper(base, exp - 1, accumulator * base);
    }

    public static void main(String[] args) {
        MathWizard wizard = new MathWizard();

        int num = 29;
        System.out.println(num + " is prime: " + wizard.isPrime(num));

        int factNum = 5;
        System.out.println("Factorial of " + factNum + ": " + wizard.factorial(factNum));
        double factDouble = 5.0;
        System.out.println("Factorial of " + factDouble + ": " + wizard.factorial(factDouble));

        int fibNum = 10;
        System.out.println("Fibonacci of " + fibNum + ": " + wizard.fibonacci(fibNum));

        int a = 48, b = 18;
        System.out.println("GCD of " + a + " and " + b + ": " + wizard.gcd(a, b));
        System.out.println("LCM of " + a + " and " + b + ": " + wizard.lcm(a, b));

        double base = 2.0;
        int exp = 3;
        System.out.println(base + " raised to the power of " + exp + ": " + wizard.power(base, exp));
    }
}
