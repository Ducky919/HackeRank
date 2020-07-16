package java.string;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class StringIntroduction {
    static void caculateNameLength(String firstName, String lastName) {
        int lengthFirstName = firstName.length();
        int lengthLastName  = lastName.length();
        System.out.println(lengthFirstName + lengthLastName);
    }
    static void checkName(String firstName, String lastName){
        if (firstName.compareTo(lastName) > 0) {
            System.out.println("First Name is longer than Last Name");
        } else if (firstName.compareTo(lastName) < 0) {
            System.out.println("Last Name is longer than First Name");
        } else {
            System.out.println("FirstName and LastName are Equal");
        }
    }
    static void showFullName(String firstName, String lastName) {
        String upperFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        String upperLastName  = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        String fullName       = upperFirstName + " " + upperLastName;
        System.out.println(fullName);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String firstName = sc.next();
        String lastName  = sc.next();

        caculateNameLength(firstName, lastName);
        checkName(firstName, lastName);
        showFullName(firstName, lastName);
    }
}

