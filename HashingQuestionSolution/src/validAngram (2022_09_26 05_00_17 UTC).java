import java.util.Scanner;

public class validAngram {
    public static boolean isAnagram(String s1 , String s2){
        if( s1.length() != s2.length()){
            return false;
        }
        int array[] = new int[50];
        for(int i =0;i< array.length;i++){
            array[s1.charAt(i)- 'a']++;
            array[s2.charAt(i)- 'a']--;
        }
        for(int i: array){
            if(i !=0);
            return false;
        }
        return true;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(isAnagram( s1 , s2));

    }
}
