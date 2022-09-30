import java.util.*;
public class ImplementingInsertionshort {
    public static void Insertionshort(int [] array, int n){
        for (int i =0; i<n;i++){
            int temp =  array[i];
            int j = i-1;

            while(j>=0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1]= temp;

        }

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] array = new int[n];
            for (int i =0; i<n;i++){
                array[i]= sc.nextInt();
            }
            Insertionshort(array , n);
            for (int i =0; i<n;i++){
                System.out.print(array[i]+" ");
        }
            System.out.println();
    }

}
}