import java.util.Scanner;

public class selectionSortDisscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(array[j]>array[min]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min]= temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
