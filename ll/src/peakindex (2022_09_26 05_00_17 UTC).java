import java.util.Scanner;

public class peakindex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int starting=0;
        int last = array.length-1;
        int mid = starting+(last-starting)/2;

            if((mid==0 || array[mid-1]<= array[mid]) && (mid == n-1 || array[mid+1]<= array[mid])){
                System.out.println(mid);
            }
            else if
        (mid>0 && array[mid-1]>array[mid]){
                starting++;
            }
            mid= starting+(last-starting)/2;

        }
    }