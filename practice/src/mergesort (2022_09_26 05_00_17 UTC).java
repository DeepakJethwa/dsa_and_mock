import java.util.Scanner;
public class mergesort {
    public static void conquer(int array[] , int low , int mid , int high){
        int merged[] = new int[high-low +1];
        int index1 = low;
        int index2 = mid +1;
        int x = 0;
        while(index1 <= mid && index2 <= high){
            if(array[index1]<= array[index2]){
                merged[x++] = array[index1++];
            }else{
                merged[x++] = array[index2++];
            }
        }
        while(index1 <= mid){
            merged[x++] = array[index1++];
        }
        while(index2 <= high){
            merged[x++] = array[index2++];
        }
        for(int i = 0 , j= low; i< merged.length;i++,j++){
            array[j] = merged[i];
        }
    }
    public static void mergesort(int array[], int low , int high){
        if(low<high){
            int mid = low+ (high-low)/2;
            mergesort(array , low , mid);
            mergesort(array , mid+1 , high);
            conquer(array , low , mid , high);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        mergesort(array , 0 , n-1);
        for(int i =0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}
