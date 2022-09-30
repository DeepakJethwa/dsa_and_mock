import java.util.Scanner;

public class moveallzerotoend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int count = 0;

        for (int i = 0; i < n; i++)
            if (array[i] != 0)
                array[count++] = array[i];


        while (count < n)
            array[count++] = 0;

        for (int i=0; i<n; i++)
            System.out.print(array[i]+" ");
    }
    }
