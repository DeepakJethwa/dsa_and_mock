import java.util.Scanner;
public class MaxAndMinimumElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for(int i =0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
            if(array[i]>max){
                max = array[i-1];
            }
        }

        System.out.println(min+" "+max);

    }
}
