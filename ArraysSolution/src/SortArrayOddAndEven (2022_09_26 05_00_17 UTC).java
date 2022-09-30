import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class SortArrayOddAndEven {
    public static void arraymerge(Integer array[], int n) {
        int si = 0;
        int li = n - 1;
        int k = 0;

        while (si < li) {
            while (array[si] % 2 != 0) {
                si++;
                k++;
            }
            while (array[li] % 2 == 0) {
                li--;
            }
            if (si < li) {
                int temp = array[si];
                array[si] = array[li];
                array[li] = temp;
            }
        }
        Arrays.sort(array, 0, k);
        // Sort even number in ascending order
        Arrays.sort(array, k, n, Collections.reverseOrder());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        Integer array[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        arraymerge(array, array.length);
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
