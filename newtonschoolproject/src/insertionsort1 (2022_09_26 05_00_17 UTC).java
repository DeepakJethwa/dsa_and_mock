import java.util.*;
public class insertionsort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        // 6 5 4 3 2 1
        // 5 6 4 3 2 1
        // 4 5 6 3 2 1
        for (int i = 1; i < n; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current > array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
