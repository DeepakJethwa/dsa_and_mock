import java.util.Scanner;
public class mergesort {
    public static void conquer(int array[], int si ,int mid, int ei) { //logn
        int merged[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (array[idx1] <= array[idx2]) {
                merged[x++] = array[idx1++];
            } else {
                merged[x++] = array[idx2++];

            }
        }
        while (idx1 <= mid) {
            merged[x++] = array[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = array[idx2++];
        }
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            array[j] = merged[i];
        }
    }
    public static void divide(int array[], int si , int ei){ // n
        if( si >=ei){
            return;
        }
        int mid = si +(ei-si)/2; // 0+4/ 2 2
        divide(array , si,mid);
        divide(array ,mid+1,ei);
        conquer (array,si , mid , ei);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        divide(array, 0 , n-1);
        for(int i=0; i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
}

// divide and conquer
// time colpexity n log n