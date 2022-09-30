import java.util.*;
public class duplicateinanarray {
    public static void main(String[] args) {
        String str = "HI RAHUL I AM FINE RAHUL";
        String word[]= str.split(" ");
        for(int i =0;i< word.length;i++){
            for(int j =i+1;j< word.length;j++){
                if(word[i].equals(word[j])){
                    System.out.println(word[j]);
                }
            }
        }
    }
}
