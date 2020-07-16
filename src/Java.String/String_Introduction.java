package java.string;
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class String_Introduction {
    static void NameLength(String FirstName,String LastName) {
        int LengthFirstName=FirstName.length();
        int LengthLastName=LastName.length();
        System.out.println(LengthFirstName + LengthLastName);
    }
    static void NameCompare(String FirstName,String LastName){
        if (FirstName.compareTo(LastName) > 0) {
            System.out.println(FirstName);
        } else if (FirstName.compareTo(LastName) < 0) {
            System.out.println(LastName);
        } else {
            System.out.println("FirstName and LastName are Equal");
        }
    }
    static void FullName(String FirstName,String LastName) {
        String UpperFirstName=FirstName.substring(0,1).toUpperCase() + FirstName.substring(1);
        String UpperLastName=LastName.substring(0,1).toUpperCase() + LastName.substring(1);
        String FullName=UpperFirstName + " " + UpperLastName;
        System.out.println(FullName);
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String FirstName=sc.next();
        String LastName=sc.next();

        NameLength(FirstName,LastName);
        NameCompare(FirstName,LastName);
        FullName(FirstName,LastName);
    }
}

