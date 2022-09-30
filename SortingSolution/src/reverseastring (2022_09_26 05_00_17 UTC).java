import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char[] try1 = s1.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--) {
            System.out.print(try1[i]);
        }
    }
}

//               OR
//        Scanner scanner = new Scanner(System.in);
//        String Str = scanner.nextLine();
//        char[] arr = Str.toCharArray();
//
//        String rev = " ";
//
//        for(int i = Str.length() - 1; i >= 0; i--)
//        {
//            rev = rev + Str.charAt(i);
//        }
//        System.out.println(rev);


        //OR


//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        String twostr= " ";
//        char ch;
//        for (int i=0; i<str.length(); i++)
//        {
//            ch= str.charAt(i);
//            twostr= ch+twostr;
//        }
//        System.out.println(twostr);
//    }
//}