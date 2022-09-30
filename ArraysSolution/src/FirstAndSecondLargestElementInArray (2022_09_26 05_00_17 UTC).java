import java.util.Scanner;
public class FirstAndSecondLargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int i;
        if (array.length < 3) {
            System.out.println("invalid input");
            return;
        }
        int largest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        // find the largest element
        for (i = 0; i < array.length; i++) {
            largest = Math.min(largest, array[i]);
        }
        //SECOND SMALLEST
        for (i = 0; i < array.length; i++) {
            if (array[i] != largest)
                second = Math.min(second, array[i]);
        }
        // THIRD SMALLEST
        for (i = 0; i < array.length; i++) {
            if (array[i] != second && array[i] != largest)
                third = Math.min(third, array[i]);
        }

        if (largest == Integer.MAX_VALUE) {
            System.out.println(n);
        } else {
            System.out.println(largest+" "+second);
        }
    }
}

//        if(array.length<2){
//            System.out.println("invalidinput");
//        }
//        int i;
//        int first = Integer.MAX_VALUE;
//        int second = Integer.MAX_VALUE;
//        int third = Integer.MAX_VALUE;
//
//        for(i =0 ;i<array.length;i++){
//            first = Math.min(first , array[i]);
//        }
//
//        for(i=0 ; i<array.length;i++){
//            if(array[i] != first ){
//                second = Math.min(second , array[i]);
//            }
//        }
//        for(i =0 ;i<array.length;i++){
//            if(array[i]!= second && array[i] != first){
//                third = Math.min(third , array[i]);
//            }
//        }
//        if(third == Integer.MAX_VALUE){
//            System.out.println("-1");
//        }else{
//            System.out.println(third);
//        }
//
//    }
//}
