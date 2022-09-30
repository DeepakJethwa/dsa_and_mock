import java.util.*;
public class maxelementinarray {
    public static void main(String args[]) {
//        int []arr = {10, 324, 45, 90, 9808};
//        int n = arr.length;
//        Arrays.sort(arr);
//        System.out.println(arr[n-1]);

        //MINIMUM ILEMENT IN ARRAY REVERSE  ORDER


//        Integer [] arr = {10, 324, 45, 90, 9808 , 12546};
//        int n = arr.length;
//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr));
//        for(int i=n-1;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }
//    }
//}

////            Arrays.sort(array);
////            System.out.print(array[n-1]+" ");
////            System.out.print(array[1]);
////        }
////        System.out.println();
//            int temp;
//            for (i = 0; i < n; i++) {
//                for (j =1; j < n - i; j++) {
//                    if (array[j - 1] > array[j]) {
//                        temp = array[j - 1];
//                        array[j - 1] = array[j];
//                        array[j] = temp;
//
//                    }
//                }
//
//            }
//                System.out.print(array[n-1]+" ");
//            System.out.print(array[0]);
//            System.out.println();
//
//
//
//        }
//    }
//}
        Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            int array [] = new int[n];
            for(int j=0; j<n;j++){
                array[j]= sc.nextInt();
            }

            int min = array[0];
            int max = array[0];

            for( int j =0;j<array.length;j++){
                if(array[j]<min){
                    min= array[j];
                }
                if(array[j]>max){
                    max= array[j];
                }
            }
            System.out.println(max+" "+min);
        }
    }
