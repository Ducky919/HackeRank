package JavaString;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class JavaPrimeNumber {
    public static boolean checkPrimeNumber(int inputInt) {
        if (inputInt < 2) {
            return false;
        } else if (inputInt == 2) {
            return true;
        } else if (inputInt % 2 == 0) {
            return false;
        }
        for (int i = 3; i < inputInt;i += 2) {
            if (inputInt % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputInt = sc.nextInt();
        String message = checkPrimeNumber(inputInt) ? "prime" : "not prime";
        System.out.println(message);
    }
}
