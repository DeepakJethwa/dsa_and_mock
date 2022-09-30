import java.util.Scanner;
public class closestprime {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        int a=1;
        for(int i=n;i>=Math.sqrt(n);i--){
            if(prime(i)){
                System.out.println(i);
                break;
            }else if(prime(n-a)){
                System.out.println(n-a);
                break;
            }else if(prime(n+a)){
                System.out.println(n+a);
                break;
            }
            a++;
        }

    }
    static boolean prime(int n){
        if(n<=1)
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }

        return true;
    }
}