import java.io.*;
import java.util.*;

public class JavaBitSetTest {

    public static void main(String[] args) {
        // Create BitSet B1 and B2
        Scanner sc = new Scanner(System.in);
        int bitSize = sc.nextInt();
        BitSet B1 = new BitSet(bitSize);
        BitSet B2 = new BitSet(bitSize);

        // Create Operation and check each condition
        int operation = sc.nextInt();
        String logicalString = "";
        int x,y;
        while (operation > 0) {
            logicalString = sc.next();
            x = sc.nextInt();
            y = sc.nextInt();
            switch(logicalString) {
                case "OR":
                    if (x == 1) {
                        B1.or(B2);
                    } else {
                        B2.or(B1);
                    }
                    break;
                case "AND":
                    if (x == 1) {
                        B1.and(B2);
                    } else {
                        B2.and(B1);
                    }
                    break;
                case "XOR":
                    if (x == 1) {
                        B1.xor(B2);
                    } else {
                        B2.xor(B1);
                    }
                    break;
                case "FLIP":
                    if (x == 1) {
                        B1.flip(y);
                    } else {
                        B2.flip(y);
                    }
                    break;
                case "SET":
                    if (x == 1) {
                        B1.set(y);
                    } else {
                        B2.set(y);
                    }
                default:
            }

            // Print out Number of Bitset 1 and 2
            System.out.println(B1.cardinality() + " " + B2.cardinality());
            // Get to the next operation
            operation--;
        }
    }
}