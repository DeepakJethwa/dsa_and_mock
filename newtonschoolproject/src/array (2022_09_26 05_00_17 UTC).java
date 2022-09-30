import java.util.*;

public class array {
    public static void main(String args[]) {
        Integer[] arr = {10, 7, 8, 9, 1, 5};
//
//        Arrays.sort(arr , Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr));

//    int [] arr = { 10, 7, 8, 9, 1, 5 };
//
//        Arrays.sort(arr , 1 , 5);
//                System.out.println(Arrays.toString(arr));

//        String [] arr = {"DEEPAK", "RAHUL", "HOTTY"};
//
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(new int[]{11, 12, 13, 14, 15}.length); //Output : 5
//        System.out.println(arr [2]); //Output : 5
        System.out.print(Arrays.toString(arr));
        for (int i : arr) {
            System.out.print(i);
        }

    }
}


