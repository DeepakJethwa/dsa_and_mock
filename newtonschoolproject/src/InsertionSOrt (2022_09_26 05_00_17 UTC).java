import java.util.*;
public class insertionsort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int temp=0;
        for (int i =0;i<n;i++){
            int min =i;
            for (int j =i+1;j<n;j++){
                if(array[j]<array[min]){
                    min = j;
                }
            }
            temp = array[i]; // TEMP = 6
            array[i]= array[min];// ARRAY I = 1
            array[min]=temp;// 6

        }

        for (int i =0;i<n;i++){
            System.out.print(array[i]+" ");
        }

    }
}
