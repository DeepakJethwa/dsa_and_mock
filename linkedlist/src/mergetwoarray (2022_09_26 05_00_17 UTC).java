import java.util.*;
public class mergetwoarray {
    public static void mergesort(int array1[] , int array2[] ,  int c[]) {
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                c[k++] = array1[i++];
            } else {
                c[k++] = array2[j++];
            }
        }
        while (i < array1.length) {
            c[k++] = array1[i++];
        }
        while (j < array2.length) {
            c[k++] = array2[j++];
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int array1[] = new int[n];
        int array2[] = new int[m];
        for(int i =0 ; i<n;i++){
            array1[i] = sc.nextInt();
        }
        for(int j=0 ;j<m;j++){
            array2[j]= sc.nextInt();
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        int c[] = new int [n+m];

        mergesort(array1 , array2 , c);

        for(int i=0;i<array1.length +array2.length;i++){
            System.out.print(c[i]+" ");
        }

    }
}
