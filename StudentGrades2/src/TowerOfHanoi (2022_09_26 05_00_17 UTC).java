import java.util.*;
public class TowerOfHanoi {
    public static void TOH(int n , String source ,String dest , String temp){
        if (n <= 0){
            return;
        }
        if (n == 1){
            System.out.println(n+":"+source+"->"+dest);
            return;
        }
        if (n == 2){
            System.out.println(n-1+":"+source+"->"+temp);
            System.out.println(n+":"+source+"->"+dest);
            System.out.println(n-1+":"+temp+"->"+dest);
            return;
        }
        TOH(n-1, source, temp , dest );
        System.out.println(n+":"+source+"->"+dest);
        TOH(n-1, temp,dest,source );

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TOH(n , "A" , "C" , "B");
    }
}