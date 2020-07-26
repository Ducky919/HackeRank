import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        BigInteger inputNumber1 = new BigInteger(userInput.next());
        BigInteger inputNumber2 = new BigInteger(userInput.next());
        System.out.println(inputNumber1.add(inputNumber2));
        System.out.println(inputNumber1.multiply(inputNumber2));
    }
}