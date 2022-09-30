import java.util.Scanner;

public class reverseanarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int temp, i;
        for (i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[n- 1 - i];
            array[n - 1 - i] = temp;
        }
        for( i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(array[n-1-i]+" ");
//        }
    }
}
