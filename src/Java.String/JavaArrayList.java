
import java.util.*;
public class JavaArrayList {
    public static void main(String[] args) {

    //Create lines with number
    Scanner sc = new Scanner(System.in);
    int numberOfLines = sc.nextInt();
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    for (int i = 0; i < numberOfLines; i++) {
        ArrayList<Integer> subList = new ArrayList<>();
        int d = sc.nextInt();
        for (int j = 0; j < d;j++) {
            subList.add(sc.nextInt());
        }
        mainList.add(subList);
    }

    //  Create and Check Query Condition
    int q = sc.nextInt();
    for (int i = 0; i < q;i++) {
        int x = sc.nextInt(); // Line
        int y = sc.nextInt(); // Position

        // If y position larger than x line's length then Error
        if (y > mainList.get(x-1).size()) {
            System.out.println("ERROR");
        } else {
            // Get number position y on x line
            System.out.println(mainList.get(x-1).get(y-1));
        }
    }
    }
}
