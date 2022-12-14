import java.util.*;
public class compressstring {
    public static String compression1(String s){
        String b = s.charAt(0)+ "";
        for(int i=1;i<s.length();i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);

            if(curr != prev){
                b+= curr;
            }
        }
        return b;
    }
    public static String compression2(String s){
        String b = s.charAt(0)+ "";
        int count =1;
        for(int i=1;i<s.length();i++) {
            char curr = s.charAt(i);
            char prev = s.charAt(i - 1);
            if (curr == prev) {
                count++;
            }
            else{
                if(count>1){
                    b+=count;
                    count =1;
                }
                b+=curr;
            }
        }
        if(count>1) {
            b += count;
            count = 1;
        }
        return b;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(compression1(s));
        System.out.println(compression2(s));
    }
}
