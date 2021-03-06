package JavaExceptionHandling;

import java.util.Scanner;
class MyCalculator {
    public static long power(int n, int p) throws Exception {
        // n and p should be positive
        if (n <= 0 || p <= 0) {
            throw new Exception ("n and p should be positive numbers.");
        }

        return ((int)Math.pow(n,p));
    }
}
public class JavaHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}