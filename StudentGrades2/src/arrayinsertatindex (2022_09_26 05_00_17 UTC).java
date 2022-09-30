import java.util.*;
public class arrayinsertatindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int k = 0; k < tc; k++) {
            int n = sc.nextInt();
            int element = sc.nextInt();
            int pos = sc.nextInt();
            int array[] = new int[n];
            int array2[] = new int[n + 1];

            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }


            for (int i = 0; i < pos - 1; i++) {
                array2[i]= array[i];
            }
            array2[pos-1]= element;
            int j= pos-1;
            for (int i=pos;i<=n;i++){
                array2[i]=array[j];
                j++;
            }
            for (int i=0;i<=n;i++){
                System.out.print(array2[i]+" ");
            }
            System.out.println();

        }
    }
}
