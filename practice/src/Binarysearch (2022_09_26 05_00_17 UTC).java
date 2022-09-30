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
        int li =0;
        int hi = array.length-1;
        int index =-1;
        while(li<=hi){
            int mid = li+(hi-li)/2;
            if(array[mid] == search){
                index = mid;
                li = mid+1;
            }
            else if(array[mid]< search){
                li = mid+1;
            }
            else{
                hi =mid-1;
            }
        }
        System.out.println(index);
    }
}