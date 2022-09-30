import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int search = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
            int si = 0;
            int hi = array.length - 1;
            int mid = si + (hi - si) / 2;
            int index = -1;

            while(si<=hi){
                if(array[mid] == search) {
                    index = mid;
                   hi = mid - 1;
                }
                else if(array[mid]< search){
                    si = mid+1;
                }
                else{
                    hi = mid-1;
                }
                mid = si+(hi-si)/2;
            }
        System.out.println(index);

    }
}
