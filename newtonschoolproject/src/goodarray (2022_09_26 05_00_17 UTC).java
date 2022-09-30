import java.util.*;
public class goodarray {
    public static int goodarray(int x, int y){ //2 , 4
        if (y==0)
            return x;
            return(goodarray(y,x%y));
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        goodarray(x ,y);
        System.out.println(goodarray(x ,y));
    }
}
