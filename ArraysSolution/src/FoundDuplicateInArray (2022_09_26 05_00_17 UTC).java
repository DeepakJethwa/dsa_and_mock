import java.util.HashSet;
import java.util.Scanner;
public class FoundDuplicateInArray {
//    public static int partition(int array[], int si, int hi) {
//        int pivot = array[hi];
//        int i = si - 1;
//        for (int j = si; j < hi; j++) {
//            if (array[j] < pivot) {
//                i++;
//                //swap
//                int temp = array[i];
//                array[i] = array[j];
//                array[j] = temp;
//            }
//        }
//        i++;
//        int temp = array[i];
//        array[i] = pivot;
//        array[hi] = temp;
//        return i;
//    }
//
//    public static void quicksort(int array[], int si, int hi) {
//        if (si <= hi) {
//            int pivotindex = partition(array, si, hi);
//            quicksort(array, si, pivotindex - 1);
//            quicksort(array, pivotindex + 1, hi);
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
//        quicksort(array, 0, n - 1);

                   //found duplicate in array
        HashSet<Integer> set = new HashSet<Integer>();

        for (int element : array) {
            if (!set.add(element)) {
                System.out.print(element);
            }
        }
    }
}

////             //remove duplicate
//            HashSet<Integer> set = new HashSet<Integer>();
//            for(int element : array){
//                if(set.add(element)){
//                    System.out.print(element+" ");
//                }
//            }

