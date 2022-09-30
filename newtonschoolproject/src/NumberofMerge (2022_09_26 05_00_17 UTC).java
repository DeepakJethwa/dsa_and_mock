import java.util.*;
public class NumberofMerge {
    private static int count = 0;
    public static void mergearray(int[] arr , int left , int mid, int right) {
        int[] newarr = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                newarr[k] = arr[i];
                i++;
            } else {
                newarr[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            newarr[k] = arr[i];
            i++;
            k++;
        }
        while (j <= right) {
            newarr[k] = arr[j];
            j++;
            k++;
        }
        for (i=left, k=0; i<=right;i++,k++){
            arr[i] = newarr[k];
        }
    }
    public static void ImplementMergeSort(int[] arr ,int left , int right){
        if (left>=right){
            return;
        }
        int mid = (left + right)/2;
       ImplementMergeSort(arr ,left , mid);
       ImplementMergeSort(arr , mid+1 , right);
       mergearray(arr , left, mid ,right);
       count++;
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i =0 ; i <n;i++){
            arr[i]= sc.nextInt();
        }
        ImplementMergeSort(arr , 0 , n-1);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n"+count);

    }
}
