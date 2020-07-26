import java.util.Scanner;

public class StringIntroduction {
    public int calculateNameLength(String firstName, String lastName) {
        int lengthFirstName = firstName.length();
        int lengthLastName  = lastName.length();
        return lengthFirstName + lengthLastName;
    }
    public void checkName(String firstName, String lastName) {
        int lexicographicOrderResult = firstName.compareTo(lastName);
        if (lexicographicOrderResult > 0) {
            System.out.println("First Name is longer than Last Name");
        } else if (lexicographicOrderResult < 0) {
            System.out.println("Last Name is longer than First Name");
        } else {
            System.out.println("FirstName and LastName are Equal");
        }
    }
    public void showFullName(String firstName, String lastName) {
        String upperFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        String upperLastName  = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        String fullName       = upperFirstName + " " + upperLastName;
        System.out.println(fullName);
    }
    public static void main(String[] args) {
        Scanner sc       = new Scanner(System.in);
        String firstName = sc.next();
        String lastName  = sc.next();
        StringIntroduction stringIntroductionObject = new StringIntroduction();
        System.out.println(stringIntroductionObject.calculateNameLength(firstName, lastName));
        stringIntroductionObject.checkName(firstName, lastName);
        stringIntroductionObject.showFullName(firstName, lastName);
    }
}

