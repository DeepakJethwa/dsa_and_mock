import java.util.Scanner;

public class numberofprime {
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
        int sum=0;
        for (int j=0; j<t;j++){
            int a=sc.nextInt();
            for (int k =2; k<=a;k++)
                System.out.println(k);
            }
        }

        }
