import java.util.*;
public class printevennumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2; i<=n; i++){
            if (i%2==0)
            System.out.println(i+ " ");
        }
    }
}
