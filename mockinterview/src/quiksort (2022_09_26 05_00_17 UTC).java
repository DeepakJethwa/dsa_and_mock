import java.util.Scanner;

public class quiksort {
    public static int partition(int array[], int low , int high){
        int pivot = array[high];
        int i = low-1;

        for(int j = low  ;j<high; j++){
            if(array[j]<pivot){
                i++;
                int temp = array[i];
                array[i]= array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = pivot;
        array[high] = temp;
        return i;

    }
    public static void mergesort(int array[], int low , int high){
        if(low<high){
            int mid = low+(high-low)/2;
            quicksort(array , low , pivotindex-1);
            quicksort(array ,pivotindex+1 , high );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        mergesort(array , 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}

//time complexity worst case n^2
// average n log n
// pivot and partition
