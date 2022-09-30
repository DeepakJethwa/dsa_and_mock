import java.util.Scanner;
public class Sort0S1Sand2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                zero++;
            } else if (array[i] == 1) {
                one++;
            } else {
                two++;
            }
        }
        int index = 0;
        for (int i = 1; i <= zero; i++) {
            array[index++] = 0;
        }
        for (int i = 1; i <= one; i++) {
            array[index++] = 1;
        }
        for (int i = 1; i <= two; i++) {
            array[index++] = 2;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
