import java.util.Scanner;

public class reverseanarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
