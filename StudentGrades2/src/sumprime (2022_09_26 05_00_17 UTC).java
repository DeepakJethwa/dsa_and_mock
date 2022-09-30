import java.util.*;
public class sumprime {
    public static boolean checkprime(int n){
        if (n <= 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        if(n % 2 == 0){
            return false;
        }
        for(int i = 3; i <= (int) Math.sqrt(n); i += 2){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum =0;
            for (int i =l;i<=r;i++){
                if (checkprime(i)){
                    sum+= ((i/10)%10);
                }
            }
            System.out.println(sum);
        }
    }
}