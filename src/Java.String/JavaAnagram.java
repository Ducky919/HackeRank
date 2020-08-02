import java.lang.reflect.Array;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagram {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If 2 string has difference length then Not Anagrams
        if (a.length() != b.length())
            return false;

        char[] charA = a.toCharArray();
        char[] charB = b.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);

        String stra = new String(charA);
        String strb = new String(charB);


        for (int i = 0;i < stra.length();i++) {
            if (stra.charAt(i) != strb.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    static boolean checkAnagram(String s1, String s2) {
        // conner case
        if (s1.length() != s2.length()) {
            return false;
        }

        // normal case;
        // lowercase is based
        int[] countArray = new int[128];
        int gapLowerUpperCase = 'a' - 'A';
        //System.out.println("Gap: " + gapLowerUpperCase);
        for(int i = 0; i < s1.length(); i++) {
            int c = s1.charAt(i);
            // convert uppercase to lowercase
            if (c >= 'A' && c <= 'Z') {
                c += gapLowerUpperCase;
            }
            countArray[c] += 1;
        }
        for(int i = 0; i < s2.length(); i++) {
            int c = s2.charAt(i);
            countArray[c] -= 1;
        }
        // check
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = checkAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}


