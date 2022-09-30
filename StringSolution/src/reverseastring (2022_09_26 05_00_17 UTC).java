import java.util.*;
public class reverseastring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String twostr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            twostr = ch + twostr;
        }
        System.out.println(twostr);

//        int lang = str.length();
//        String rev="";
//        for(int i = lang-1;i>=0;i--){
//            rev = rev+ str.charAt(i);
//        }
//        System.out.println(rev);
    }
}

