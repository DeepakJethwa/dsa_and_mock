import java.util.Scanner;
public class MergeTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int array1[] = new int[n];
        int array2[] = new int[m];
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            array2[i] = sc.nextInt();
        }
        int []c = new int [array1.length+ array2.length];
        int count =0;

        for(int i=0;i< n;i++){
            c[i] = array1[i];
            count++;
        }
        for(int i=0;i<m;i++){
            c[count++]=array2[i];
        }

        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}
