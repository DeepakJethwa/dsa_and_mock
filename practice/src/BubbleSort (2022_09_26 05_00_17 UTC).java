import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int search = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int i;
        int sum = 0;
        for(i=0;i<n-2;i++){
            sum = sum+array[i];
        }
        if( sum - array[n] == search){
            System.out.println(array[i]);

        }

        // 10 20 30 40 1 2
    }
}
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < n - i; j++) {
//                if (array[j - 1] < array[j]) {
//                    int temp = array[j-1];
//                    array[j-1] = array[j];
//                    array[j]= temp;
//                }
//            }
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(array[i]+" ");
//        }
//    }
//}
