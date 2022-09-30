import java.util.*;
public class mohitandarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n - 1; i++) {
            a[i] = sc.nextInt();
        }
        int sum1 = 0;
        for (int i = 0; i < n - 1; i++) {
            sum1 = sum1 + a[i];
        }
        int sum2 = 0;
        for (int i = 1; i <= n; i++) {
            sum2 = sum2 + i;
        }
        System.out.println(sum2 - sum1);
    }
}