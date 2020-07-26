import java.io.*;
import java.util.*;

public class JavaReversed {

    // Method to check whether input is PalindromeString or not
    public static boolean checkPalindromeString(String input) {
        for (int left_idx = 0, right_idx = input.length() - 1; left_idx < right_idx; left_idx++, right_idx--) {
//        while (left_idx < right_idx) {
            if (input.charAt(left_idx) != input.charAt(right_idx)) {
                return false;
            }
        }
        return true;
    }

    // Main Program Start from here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String message = checkPalindromeString(inputString) ? "This string is a Palindrome String" : "This string is not a Palindrome String";
        System.out.println(message);
    }
}


//        System.out.println( (count == A.length()/2) ? "Yes" : "No") ;



//        //String reversed = new ;
//        if (A.equals(new StringBuilder(A).reverse().toString())) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }




//originalString = User Input
//reversedString = "";
//
//for (i = originalString.length() - 1; i >= 0, i--) {
//    reversedString += originalString.index(i)
//        }
//   if originalString.equal(reversedString) {
//       Print (Yes)
//        } else {
//       Print(No)
//        }




