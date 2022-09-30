import java.util.*;
public class angaram {
    public static boolean isanagram(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        int array[] = new int[50];
        for (int i = 0; i < s2.length(); i++) {
            array[s1.charAt(i) - 'a']++;
            array[s2.charAt(i) - 'a']--;
        }
        for (int i : array) {
            if (i != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        isanagram(s1 ,s2);
        System.out.println(isanagram(s1,s2));
}
}
