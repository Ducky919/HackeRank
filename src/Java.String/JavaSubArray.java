import java.util.Scanner;

public class JavaSubArray {

    // Method to get number of Negative SubArray in Main Array
    public static int getNegativeSubArray(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum = sum + array[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {

        // Create Array by User Input
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0;i < size;i++) {
            array[i] = sc.nextInt();
        }
        sc.close();

        // Print out result
        System.out.println(getNegativeSubArray(array));

    }
}
