import java.util.*;
import java.io.*;
public class lenearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k = sc.next();
        int temp=0;

            String item [] = sc.nextLine().trim().split(" ");
            for (int i = 0; i <item.length; i++) {
                if (item[i].equals(k)) {
                    System.out.println(i+" ");
                    temp++;
                }
            }
            if(temp==0){
                System.out.print("not found");
            }
        System.out.println();
        }
    }

