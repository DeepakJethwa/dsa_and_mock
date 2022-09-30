import java.util.Scanner;

public class Arrayinsertatend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int element = sc.nextInt();
            int array[] = new int[m + 1];
            for (int j = 0; j <m; j++) {
                array[j] = sc.nextInt();
            }
            array[m]= element;


            //output
            for (int j =0; j<=m;j++){
                System.out.print(array[j]+" ");
            }
            System.out.println();
        }
    }
}