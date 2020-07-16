package java.string;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class String_Introduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        int LenA = A.length();
        int LenB = B.length();
        System.out.println(LenA + LenB);

        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        String UpperA = A.substring(0,1).toUpperCase() + A.substring(1);
        String UpperB = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.println(UpperA + " " + UpperB);

    }
}

