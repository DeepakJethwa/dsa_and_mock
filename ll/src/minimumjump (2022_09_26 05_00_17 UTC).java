import java.util.Scanner;

public class minimumjump {

        static int minJumps(int arr[], int l, int h)
        {
            if (h == l)
                return 0;
            if (arr[l] == 0)
                return Integer.MAX_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = l + 1; i <= h
                    && i <= l + arr[l];
                 i++) {
                int jumps = minJumps(arr, i, h);
                if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
                    min = jumps + 1;
            }
            return min;
        }

        // Driver code
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Minimum number of jumps to reach end is "
                    + minJumps(arr, 0, n - 1));
        }
    }
