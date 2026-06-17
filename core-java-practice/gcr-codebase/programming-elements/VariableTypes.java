public class VariableTypes {
    static int firstVariable; // This is a static variable of type int
    int secondVariable; // This is an non-static variable of type int

    static void m1(){
        System.out.println("This is a method m1");
        System.out.println("The value of firstVariable is: " + firstVariable);
        System.out.println("The value of secondVariable is: " + new VariableTypes().secondVariable); // Accessing non-static variable using object reference
    }
    void m2(){
        System.out.println("This is a method m2");
        System.out.println("The value of secondVariable is: " + secondVariable);
    }
    public static void main(String[] args) {
        
        VariableTypes obj1 = new VariableTypes();
        int firstVariable = 10; // Assigning value to static variable using object reference
        int secondVariable = 20; // Assigning value to non-static variable using object reference
        VariableTypes.m1(); // Calling method m1
        obj1.m2(); // Calling method m2
    }
}
