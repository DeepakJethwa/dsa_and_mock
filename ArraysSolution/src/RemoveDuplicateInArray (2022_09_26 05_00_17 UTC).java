import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateInArray {
    static void removeDuplicates(String str)
    {
        //Create LinkedHashSet of type character
       HashSet<Character> set = new HashSet<>();
        //Add each character of the string into LinkedHashSet
        for(int i=0;i<str.length();i++)
            set.add(str.charAt(i));

        // print the string after removing duplicate characters
        for(Character ch : set)
            System.out.print(ch);
    }

    //main() method start
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //removeDuplicates() method by passing the string as an argument
        removeDuplicates(str);
    }
}