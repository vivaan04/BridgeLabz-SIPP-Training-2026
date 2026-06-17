import java.util.Scanner;
public class SecretCodeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter secret code: ");
        String code = sc.nextLine();
        int vowels = 0, consonants = 0, digits = 0, specialChars = 0;
        for (int i = 0; i < code.length(); i++) {
            char ch = code.charAt(i);
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (lower == 'a' || lower == 'e' || lower == 'i' ||
                    lower == 'o' || lower == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } 
            else if (Character.isDigit(ch)) {
                digits++;
            } 
            else {
                specialChars++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + specialChars);
        if (code.length() >= 8 && digits >= 2 && specialChars >= 1) {
            System.out.println("Code Strength: Strong");
        } else {
            System.out.println("Code Strength: Weak");
        }
    }
}