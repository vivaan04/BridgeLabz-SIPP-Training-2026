// A spy agency encodes messages. Reverse a secret message, check if
// it is a palindrome, count vowels/consonants, and verify if two
// intercepts are anagrams. Extend: find the first non-repeating
// character in a surveillance log.

import java.util.Scanner;

public class Spy_Agency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the secret message:");
        String secretMessage = sc.nextLine();

        String reversedMessage = new StringBuilder(secretMessage).reverse().toString();System.out.println("Reversed Message: " + reversedMessage);


        String cleanedMessage = secretMessage.replaceAll("[^a-zA-Z]", "").toLowerCase();
        boolean isPalindrome = cleanedMessage.equals(new StringBuilder(cleanedMessage).reverse().toString());
        System.out.println("Is Palindrome: " + isPalindrome); 


        int vowelCount = 0;
        int consonantCount = 0;
        for (char c : cleanedMessage.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }
        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);


        System.out.println("Enter the first intercepted message:");
        String intercept1 = sc.nextLine();
        System.out.println("Enter the second intercepted message:");
        String intercept2 = sc.nextLine();

        // Check if the intercepts are anagrams
        boolean isAnagram = areAnagrams(intercept1, intercept2);
        System.out.println("Are the intercepts anagrams? " + isAnagram);
    }

    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        s2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] charCount = new int[26];
        for (char c : s1.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            charCount[c - 'a']--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
