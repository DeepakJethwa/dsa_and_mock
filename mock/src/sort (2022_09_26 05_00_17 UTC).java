import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            for (int j = 1; j < n - i; j++) {
                    if (array[j - 1] > array[j] && array[j] >= 0) {
                        int temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                }
            }
        }
        for(int i=0;i<n;i++) {
            System.out.print(array[i]+" ");
        }
    }
}