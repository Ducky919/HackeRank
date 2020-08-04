package JavaString;

import java.util.Scanner;

public class SmallestAndLargest {
    public String smallest;
    public String largest;

    //Constructor
    public SmallestAndLargest(String smallest, String largest) {
        this.smallest = smallest;
        this.largest = largest;
    }

    public static SmallestAndLargest getSmallestAndLargest(String inputString, int k) {
        // when ...
        if (k > inputString.length()) {
           return new SmallestAndLargest("", "");
        }

        String smallest = inputString.substring(0, k);
        String largest = inputString.substring(0, k);
        for(int i = 0; i <= inputString.length()-k; i++ ){
            String substr = inputString.substring(i,k+i);

            if (smallest.compareTo(substr) > 0){
                smallest = substr;
            }
            if (largest.compareTo(substr) < 0){
                largest = substr;
            }
        }
        return new SmallestAndLargest(smallest,largest);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k = scan.nextInt();
        scan.close();
        SmallestAndLargest result =  getSmallestAndLargest(s,k);
        System.out.println("Smallest is :" + result.smallest);
        System.out.println("Largest is :" + result.largest);
    }
}

