import java.util.Scanner;

public class printalpositivenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] >= 0) {
                sum = sum + array[i];

            }
        }

        System.out.println(sum);

    }
}
