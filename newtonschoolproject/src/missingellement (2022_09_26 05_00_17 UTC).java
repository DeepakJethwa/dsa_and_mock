import java.util.*;
public class missingellement {
    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3, 5, 6, 7};

        int n = arr.length+1;
        int total = n*(n+1)/2;
        for(int i =0 ; i<arr.length;i++){
            total =total- arr[i];
        }
        System.out.println(total);


    }

}
