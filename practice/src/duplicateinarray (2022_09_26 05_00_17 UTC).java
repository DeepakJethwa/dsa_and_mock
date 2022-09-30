import java.util.Scanner;
public class duplicateinarray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int array[] = new int[n];
        for (int i = 0; i < n; i++) {
        array[i] = sc.nextInt();
    }
        for(int i=0;i<array.length;i++){
            for(int j =i+1;j<array.length;j++){
                if(array[i]==array[j] && i!=j){
                    System.out.println(array[i]);
                    }
                }
            }
        }
}
