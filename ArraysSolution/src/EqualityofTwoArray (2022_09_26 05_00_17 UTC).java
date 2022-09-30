import java.util.Arrays;
import java.util.Scanner;
public class EqualityofTwoArray {
    public static boolean equalityornot(int array1[], int array2[]) {
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    return true;
                }}}
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int array1[] = new int[n];
        int array2[] = new int[m];
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            array2[i] = sc.nextInt();
        }
        equalityornot(array1, array2);
        if (equalityornot(array1, array2)){
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
//        System.out.println(Arrays.equals(array1, array2));
        }
    }
