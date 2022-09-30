import jdk.swing.interop.SwingInterOpUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class mergesort {
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
        }

         first = Integer.MIN_VALUE;
        second = Integer.MIN_VALUE;

        for(i=0;i< array.length;i++){
            first = Math.max(first , array[i]);
        }
        for(i =0 ;i<array.length;i++) {
            if (array[i] != first)
                second = Math.max(second, array[i]);
        }
        if(second == Integer.MIN_VALUE){
            System.out.println(n);
        }else {
            System.out.println(second);
    }
}
}
