import java.util.Scanner;

public class MergedSortDIsscending {
    public static void conquer(int array[] , int si, int mid , int ei){
        int merged[]= new int[ei-si+1];
        int index1 = si;
        int index2 = mid+1;
        int x=0;
        while(index1<= mid && index2<= ei){
            if(array[index1]<= array[index2]){
                merged[x++] = array[index1++];
            }else{
                merged[x++]= array[index2++];
            }
        }
        while(index1<=mid){
            merged[x++]= array[index1++];
        }
        while(index2<=ei){
            merged[x++]= array[index2++];
        }
        for(int i=0 , j= si ; i< merged.length;i++ , j++){
            array[j]= merged[i];
        }

    }
    public static void partition(int array[] , int si , int ei){
        if(si<ei){
            int mid = si+(ei-si)/2;
            partition(array , si ,mid);
            partition(array, mid+1, ei);
            conquer(array , si , mid , ei);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        partition(array, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
