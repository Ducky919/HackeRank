import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> L = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            L.add(number);
        }
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
//            sc.nextLine();
            String operation = sc.next();
            if (operation.equals("Insert")) {
                int y = sc.nextInt();
                int x = sc.nextInt();
                L.add(y,x);
            }
            if (operation.equals("Delete")) {
                int x = sc.nextInt();
                L.remove(x);
            }
            System.out.println(i);
        }
        for (int i = 0; i < L.size(); i++) {
            System.out.printf("%s ",L.get(i));
        }
//
    }
}
