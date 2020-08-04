package JavaExceptionHandling;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class JavaHandlingTryCatch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt(); // e
            int y = sc.nextInt(); // 1
            float result;
            result = (float)x/y;
            System.out.println(result);
        }  catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }
        catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
