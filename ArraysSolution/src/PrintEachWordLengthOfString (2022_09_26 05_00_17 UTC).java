import java.util.*;
public class PrintEachWordLengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
//        String s="Mohan Is Going to Market";
    String arr[]=s.split(" ");

        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i] +" -> "+arr[i].length());
    }
}
}
