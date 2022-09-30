import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int line = 0; line < n; line++) {
//            first line condition
            if (line == 0) {
                System.out.print("*");
            }
//        last line condition
            else if (line == n - 1) {
                for (int i = 0; i <=n; i++) {
                    System.out.print("*");
                }
            }
//        middle line
            else {
                System.out.print("*");
                for (int i = 1; i <= line; i++) {
                    System.out.print("*");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}