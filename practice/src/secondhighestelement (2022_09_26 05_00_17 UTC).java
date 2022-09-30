import java.util.*;
public class secondhighestelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int i;
        int first;
        int second;
        if(array.length<2){
            System.out.println("invalid input");
            return;
        }
        int largest = Integer.MIN_VALUE;
        second = Integer.MIN_VALUE;
            // find the largest element
        for(i=0;i< array.length;i++){
            largest = Math.max(largest , array[i]);
        }

        for(i=0 ;i<array.length;i++){
            if(array[i] != largest)
            second = Math.max(second, array[i]);
        }

        if(second == Integer.MIN_VALUE){
            System.out.println(n);
        }else{
            System.out.println(second+largest);
        }

    }
}