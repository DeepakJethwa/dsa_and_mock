import java.util.Scanner;

public class LargestpPairSum {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            if(array[0]>array[1]){
                int largest = array[0];
                int second_largest = array[1];
            }
            else{
                int largest = array[1];
                int second_largest = array[0];

                for(int i =2;i<array.length;i++){
                    if(array[i]>largest){
                        second_largest= largest;
                        largest = array[i];
                    }
                    else if(array[i]>second_largest){
                        second_largest = largest;
                    }
                }
                System.out.println(largest+","+second_largest);
            }
        }
    }
