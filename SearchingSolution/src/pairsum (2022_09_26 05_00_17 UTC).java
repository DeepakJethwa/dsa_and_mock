import java.util.Arrays;
import java.util.Scanner;
public class pairsum {
    public static int[] conquer(int array[], int low ,int mid, int high){
        int merged[] = new int[high-low+1];
        int index1 = low;
        int index2 = mid+1;
        int x =0;
        while(index1<= mid && index2<=high){
            if(array[index1]<= array[index2]){
                merged[x++] = array[index1++];
            }else{
                merged[x++] = array[index2++];
            }
        }
        while(index1<= mid){
            merged[x++] = array[index1++];
        }
        while(index2<=high){
            merged[x++] = array[index2++];
        }

        for(int i =0 , j  = low; i< merged.length;i++, j++ ){
            array[j]= merged[i];

        }
        return array;
    }
    public static void partition(int array[], int low , int high){
        if(low<high){
            int mid = low+(high-low)/2;
            partition(array , low , mid);
            partition(array , mid +1, high);
            conquer(array , low , mid , high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
//        Arrays.sort(array);
        partition(array, 0, n - 1);
        int i =0;
        int j = array.length-1;

        while(i<j){
            if(array[i] + array[j] == k){
                System.out.println(array[i]+","+array[j]);
                i++;
                j--;
            }
            else if(array[i]+array[j]< k){
                i++;
            }
            else if(array[i]+ array[j]>k){
                j--;
            }
        }
    }
}

