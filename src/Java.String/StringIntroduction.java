package java.string;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class StringIntroduction {
    static void nameLength(String _firstName,String _lastName) {
        int lengthFirstName = _firstName.length();
        int lengthLastName = _lastName.length();
        System.out.println(lengthFirstName + lengthLastName);
    }
    static void nameCompare(String _firstName,String _lastName){
        if (_firstName.compareTo(_lastName) > 0) {
            System.out.println("First Name is longer than Last Name");
        } else if (_firstName.compareTo(_lastName) < 0) {
            System.out.println("Last Name is longer than First Name");
        } else {
            System.out.println("FirstName and LastName are Equal");
        }
    }
    static void fullName(String _firstName,String _lastName) {
        String upperFirstName = _firstName.substring(0,1).toUpperCase() + _firstName.substring(1);
        String upperLastName = _lastName.substring(0,1).toUpperCase() + _lastName.substring(1);
        String fullName = upperFirstName + " " + upperLastName;
        System.out.println(fullName);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();

        nameLength(firstName,lastName);
        nameCompare(firstName,lastName);
        fullName(firstName,lastName);
    }
}

