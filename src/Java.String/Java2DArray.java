import java.util.*;

public class Java2DArray {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Input 2D Dimension Size
        int dimensionSize = scanner.nextInt();
        long starttime = System.currentTimeMillis();
        int[][] arr = new int[dimensionSize][dimensionSize];

        // Create Dimension
        for (int row = 0; row < dimensionSize; row++) {
            for (int column = 0; column < dimensionSize; column++) {
                arr[row][column] = ((int) (Math.random() * 10));
                System.out.printf("%d\t",arr[row][column]);
            }
            System.out.println();
        }
        System.out.println("Dimension Created");
        scanner.close();

        // Get Result
        System.out.println("The Biggest Number is " + getLargestHourGlassSum(arr));
        System.out.println(System.currentTimeMillis() - starttime);

    }
    public static int getEachHourGlassSum(int [][]array, int row, int column) {
        // hourGlass Shape : a b c
        //                     d
        //                   e f g
        int aPoint = array[row-1][column-1];
        int bPoint = array[row-1][column];
        int cPoint = array[row-1][column+1] ;
        int dPoint = array[row][column] ;
        int ePoint = array[row+1][column-1];
        int fPoint = array[row+1][column] ;
        int gPoint =array[row+1][column+1];
        return aPoint + bPoint + cPoint + dPoint + ePoint + fPoint + gPoint;
    }
    public static int getLargestHourGlassSum(int [][]array) {
        int max = 0;
        int dimensionSize = array.length;
        for (int row = 1; row < dimensionSize - 1 ; row++) {
            for (int column = 1; column < dimensionSize - 1; column++) {
                int sum = getEachHourGlassSum(array,row,column);
                System.out.println("The sum of row: " + row + " column: " + column + " is " + sum);
                max = Math.max(max,sum);
            }
        }
        return max;
    }
}
