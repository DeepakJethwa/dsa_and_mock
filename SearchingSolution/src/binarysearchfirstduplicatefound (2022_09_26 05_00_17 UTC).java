import java.util.Scanner;

public class BinarySearchFirstduplicatefound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int starting = 0;
        int last = array.length - 1;
        int index =-1;

        while(starting<=last){
           int mid = (starting+last)/2;
           if(array[mid]== k){
               index = mid;
              last = mid-1;
           }
           else if(array[mid]<k){
               starting= mid+1;
            }
           else {
               last = mid-1;
           }
        }
        System.out.println(index);
    }
}
