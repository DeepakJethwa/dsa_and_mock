import java.util.Scanner;

public class example {
    public static void main(String[] args) {
//      byte a = 10;
//      short b = 1000;
//      int c = 100000;
//      long d = 907401828886299l;
//      char e = '@';
//      float f = 23.2534f;
//      double g = 234.2435672;
//      boolean h = true;
//        System.out.println(a + " " + b + " "+ c + " "+ d + " "+ e + " "+ f + " "+ g + " "+ h);
//        int i;
//        for (i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        int i , a, b , ans=0;
        for ( i=0; i<tc; i++){
            a= sc.nextInt();
            b= sc.nextInt();
        if (b>=10)
            ans = 0;
         else
            ans = (10-b)*(a-1);
            System.out.println(ans);
        }
    }
}