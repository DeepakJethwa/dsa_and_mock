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
        int li = 0;
        int hi = array.length-1;
        int index = -1;

        while(li<=hi) {
            int mi = (li+hi)/2;
            if(array[mi] == search) {
                index = mi;
                hi = mi-1;
        }
             else if (array[mi] < search) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
        }
        System.out.println(index);
        }
    }

