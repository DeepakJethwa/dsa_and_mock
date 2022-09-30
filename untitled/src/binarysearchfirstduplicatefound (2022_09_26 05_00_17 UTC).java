import java.util.Scanner;

public class binarysearchfirstduplicatefound {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int search = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int starting = 0;
        int ending = array.length - 1;
        int index =-1;
        while (starting <= ending) {
            int mid = starting + (ending - starting) / 2;
            if (array[mid] == search) {
                index = mid;
                ending = mid-1;
            } else if(array[mid]<search){
                starting = mid + 1;
            }else{
                ending = mid-1;
            }
        }
        System.out.println(index);
    }
}