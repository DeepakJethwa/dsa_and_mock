import java.util.Scanner;

public class LinearSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int temp =0;
        for(int i=0 ;i<array.length;i++){
            if(array[i]== k){
                System.out.println(i);
                temp++;
            }
            }
        if(temp==0){
            System.out.println("not found");
        }

    }
}
