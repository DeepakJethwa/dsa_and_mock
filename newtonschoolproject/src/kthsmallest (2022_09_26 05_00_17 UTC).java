import java.util.*;
public class kthsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=sc.nextInt();
       Integer array[] = new Integer [n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[k-1]);
/// FOR KTH LARGEST
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println(array[k-1]);
    }
}
/*

class GFG {

    public static void main(String[] args)
    {
        int[] arr = { 12, 3, 5, 7, 19 };
        int n = arr.length;
        int k = 4;

        Set<Integer> s = new HashSet<Integer>();
        for(int i=0;i<n;i++)
            s.add(arr[i]);

        Iterator<Integer> itr = s.iterator();
        while(k>0)
        {
            itr.next();
            k--;
        }//itr points to the kth element in the set
        System.out.println(itr.next());
    }
}

public static int partition(int array[] , int low , int high){
        int pivot = array[high];
        int i = low-1;
        for(int j = low;j<high;j++){
            if(array[j]<pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[high];
        array[high]= temp;
        return i;

    }
    public static void quicksort(int array[] , int low , int high){
        if(low<high) {
            int pivotindex = partition(array, low, high);
            quicksort(array, low, pivotindex - 1);
            quicksort(array, pivotindex + 1, high);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        quicksort(array , 0 , n-1);
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}


*/







