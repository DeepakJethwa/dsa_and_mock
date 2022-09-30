import java.util.*;
public class RMSofanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long num = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            num += Math.pow(a, 2);
        }

        double mean = (double) num / (double)n;
        String sqrt = String.format("%.4f", Math.sqrt(mean));
        System.out.println(sqrt);
    }
}