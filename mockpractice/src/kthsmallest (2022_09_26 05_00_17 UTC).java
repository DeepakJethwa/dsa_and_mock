import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class kthsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);
        //kth smallest
        System.out.println(array[k-1]);
         //kth largest
        System.out.println(array[n-k]);
}
}
