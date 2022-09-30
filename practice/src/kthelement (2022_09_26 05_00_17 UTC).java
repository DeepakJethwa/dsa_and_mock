import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class kthelement{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            Integer array[] = new Integer[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            System.out.println(array[k-1]);

            Arrays.sort(array, Collections.reverseOrder());
            System.out.println(array[k-1]);
        }
}
