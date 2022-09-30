import java.util.Scanner;

public class InsertionSortDissending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current > array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
