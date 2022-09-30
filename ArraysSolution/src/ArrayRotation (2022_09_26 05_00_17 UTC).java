import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int temp = array[0];
            for (int j = 0; j < array.length-1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;
        }
        for(int i= array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }

}
