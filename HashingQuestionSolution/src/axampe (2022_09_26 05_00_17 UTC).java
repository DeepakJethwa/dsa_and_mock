import java.util.*;
public class axampe {
    public static int prefixCount(String[] words, String pref) {
        int l = words.length;
        int c = 0;
        for (int i = 0; i < l; i++) {
            String str = words[i];
            if (str.startsWith(pref) == true)
                c++;
        }
        return c;
    }

    public static void main(String[] args) {
        String words []= {"pay", "attention", "practice", "attend"};
        String pref = "at";
        prefixCount(words , pref);
        System.out.println(prefixCount(words, pref));
    }
}