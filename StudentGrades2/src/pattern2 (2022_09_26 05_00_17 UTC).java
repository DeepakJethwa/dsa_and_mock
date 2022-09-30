import java.util.*;
public class pattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int line =1 ; line<=n; line++){
                for(int j= 1; j<=line; j++){
                    System.out.print(j+ " ");
                }
            System.out.println();
            }
    }
}
