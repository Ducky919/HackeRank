package Java_Introduction;

import java.util.Scanner;
public class Stdin_Stdout_II {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();



        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}