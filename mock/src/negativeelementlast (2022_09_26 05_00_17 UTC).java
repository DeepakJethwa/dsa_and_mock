import java.util.Scanner;

public class negativeelementlast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int temp[] = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++)
            if (array[i] >= 0)
                temp[j++] = array[i];

        if (j == n || j == 0)
            return;

        for (int i = 0; i < n; i++)
            if (array[i] < 0)
                temp[j++] = array[i];

        for (int i = 0; i < n; i++) {
            array[i] = temp[i];
        }

     for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
}
}
