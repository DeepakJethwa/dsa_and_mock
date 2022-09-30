import java.util.*;
public class quicksort {
    public static int partition(int array[], int si , int ei){
        int pivot = array[ei];
        int i = si-1;
        for(int j = si ;j<ei;j++){
            if(array[j]<pivot){
                i++;
                int temp = array[i];
                array[i]= array[j];
                array[j]= temp;
            }
        }
        i++;
        int temp = array[i];
        array[i]= array[ei];
        array[ei]= temp;
        return i;
    }
    public static void quicksort(int array[] , int si , int ei){
        if(si<=ei){
            int pivotindex = partition(array , si , ei);
            quicksort(array , si , pivotindex-1);
            quicksort(array , pivotindex+1 , ei);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int array[] = new int[n];
            for(int i =0;i<n;i++){
                array[i]= sc.nextInt();
            }
           quicksort(array , 0 , n-1);
            for(int i=0;i<n;i++){
                System.out.print(array[i]+" ");
            }

    }
}
