package stringmanipulation;

import java.util.Arrays;
public class ReverseString {

    public static void main(String[] args) {

        String str = "madam";  // Input string
        char[] ch = str.toCharArray();  // Convert string to char array
        StringBuilder rev = new StringBuilder();  // Initialize StringBuilder without any space

        // Loop to reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(ch[i]);
        }

        // Print the reversed string
        System.out.println(rev.toString());

        // Check if the original string and reversed string are the same
        if (str.equals(rev.toString())) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }
}