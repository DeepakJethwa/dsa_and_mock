import java.util.Arrays;

public class anagrama {
    public static void main(String[] args) {
    String x = "silent";
        String y = "hitler";

        char a[]= x.toCharArray();
        char b[]= y.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        boolean result = Arrays.equals(a,b);

        if(result == true){
            System.out.println("string are anagram");
        }else{
            System.out.println("not anagram");
        }
    }
}
