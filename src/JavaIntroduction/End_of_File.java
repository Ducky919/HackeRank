package JavaIntroduction;

import java.io.*;
import java.util.*;
public class End_of_File {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        int count = 0;
        while (scan.hasNext()) {
            s = scan.nextLine();
            count ++;
            System.out.printf("%d %s%n",count,s);

        }

    }
}
