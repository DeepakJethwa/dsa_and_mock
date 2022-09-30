import java.util.*;
public class ShortPositivenumberNSNEGATIVECONSTANT {
    public static int[] positive(int array1[]) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length-1; j++) {
                int current = array1[j];
                if (current >= 0) {
                    if (array1[j] >= array1[j+1] && array1[j + 1] >= 0) {
                        array1[j] = array1[j+1];
                        array1[j+1] = current;
                    }
                }
            }
        }
        return array1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array1 [] = new int[n];
        for(int i=0;i<n;i++){
            array1 [i]= sc.nextInt();
        }
        int []array2 = positive(array1);
       for(int i : array2){
           System.out.print(i+" ");
       }

    }


}
