import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class MoveZeroToTheFront {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int count = array.length-1;
        for(int i = array.length-1;i>=0;i--){
            if(array[i] !=0){
                array[count--]= array[i];
            }
        }
        while(count>=0){
           array[count--]=0;
        }

        for(int i=0;i< array.length;i++){
            System.out.print(array[i]+" ");
        }
//        int count = array.length-1;
//        for (int i = array.length-1; i >=0; i--)
//            if (array[i] != 0)
//                array[count--] = array[i];
//        while (count >= 0)
//            array[count--] = 0;
//
//        for (int i=0; i<n; i++)
//            System.out.print(array[i]+" ");
    }
}

