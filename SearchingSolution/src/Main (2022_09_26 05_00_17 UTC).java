import java.util.*;
public class Main {
    public static void main(String args[]) {
//        String []my_arr = {"This", "is", "a", "sample"};
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String my_arr[] = s.split(" ");
        Arrays.sort(my_arr, Comparator.naturalOrder());
        System.out.println(Arrays.toString(my_arr));
    }
}