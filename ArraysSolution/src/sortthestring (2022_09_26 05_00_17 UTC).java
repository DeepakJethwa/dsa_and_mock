import java.util.Scanner;
public class sortthestring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] S = s.split("\\.");
        String r = S[S.length-1];

        for (int i = S.length -2; i >= 0; i--) {
            r += "." + S[i];
        }
        System.out.println(r);
    }
}