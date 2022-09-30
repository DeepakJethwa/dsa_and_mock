import java.util.*;
public class bubblesortassendingorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (array[j - 1] < array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
//
//1 2  00 01       n-1 0
//3 4  10 11       n-1 1
//
//3 1  00 01
//4 2  10 11

