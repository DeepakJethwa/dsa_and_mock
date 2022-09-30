import java.util.*;
public class insertionsortassending {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int array[] = new int [t];
        for(int i =0; i<t;i++){
            array[i]= sc.nextInt();
        }
        /*
        6 8 12 65 98 788
        8 6 12 65 98 788
        12 8 6 65 98 788
        65 12 8 6 98 788
        98 65 12 8 6 788
        788 98 65 12 8 6
         */
        for(int i=0;i<t;i++) {
            int current = array[i];
            int j = i-1;
            while(j>=0 && current < array[j]){
                array[j+1]= array[j];
                j--;
            }
            array[j+1] = current;
        }
        for(int i=0;i<t;i++){
            System.out.print(array[i]+" ");
        }
    }
}
