import java.util.*;
public class duplicateinarray {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int temp =0;
        int a =0;
        for(int i =0 ;i<array.length; i++){
            int counter =1;
            for(int j = i+1 ;j<array.length;j++){
                if(array[i] == array[j]){
                    counter++;
                }
            }
            if(temp<counter){
                temp = counter;
                a = array[i];
            }
        }
        System.out.println(a);
    }
}
