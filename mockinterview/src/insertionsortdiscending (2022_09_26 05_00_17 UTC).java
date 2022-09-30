import java.util.Scanner;
public class insertionsortdiscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int array[] = new int[t];
        for (int i = 0; i < t; i++) {
            array[i] = sc.nextInt();
        }

        for(int i=1;i<t;i++){
            int current = array[i];
            int j = i-1;
            while (j>=0 && current > array[j]){
               array[j+1]= array[j];
               j--;
            }
            array[j+1] = current;
        }
        for(int i=0;i<t;i++){
            System.out.print(array[i]+" ");
        }
    }
}