import java.util.*;
public class selectionsortdiscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // 1 2 3 4 5 6
        // 6 2 3 4 5 1

        int temp =0;
        for (int i = 0; i < n; i++) {
            int min =i;
            for (int j = i+1; j < n; j++) {
                if(array[j]<array[min]){
                    min =j;

                }
            }
            temp  = array[i];
            array[i] = array[min];
            array[min]= temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
