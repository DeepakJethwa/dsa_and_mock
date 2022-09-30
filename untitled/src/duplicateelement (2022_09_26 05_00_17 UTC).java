import java.util.Scanner;

public class duplicateelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer array[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
                    for(int i =0;i<array.length;i++){
                        for(int j =i+1 ;j<array.length;j++){
                            if(array[j]==array[i] && i!=j){
                                System.out.println(array[i]);
                }
            }
        }
    }
}
