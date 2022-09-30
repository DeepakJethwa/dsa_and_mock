import java.util.*;
public class finiteloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i =0;
        while(i<100000){
            int a = sc.nextInt();
            System.out.print(a+ " ");
            if (a==0){
              return;
            }
            i++;
        }
    }
}
