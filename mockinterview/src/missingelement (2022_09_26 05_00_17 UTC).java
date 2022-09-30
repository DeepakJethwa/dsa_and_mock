import java.util.Scanner;
public class missingelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int m = array.length+1;

        int total = m*(m+1)/2;
        for ( int i=0;i<array.length;i++){
            total = total-array[i];
        }
        System.out.println(total);
        }
}
