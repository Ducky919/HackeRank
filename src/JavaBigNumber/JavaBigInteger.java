package JavaBigNumber;

import java.util.*;
import java.math.*;


public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        BigInteger a = new BigInteger(userInput.next());
        BigInteger b = new BigInteger(userInput.next());
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}