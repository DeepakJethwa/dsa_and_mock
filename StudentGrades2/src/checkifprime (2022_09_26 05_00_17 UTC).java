import java.util.*;
public class checkifprime {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for (int j = 0; j < k; j++) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
