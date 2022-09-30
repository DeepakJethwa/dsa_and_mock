import java.util.*;
public class SELECTIONSORTDISCENDING {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int array[] = new int [t];
        for(int i =0; i<t;i++){
            array[i]= sc.nextInt();
        }
        int temp =0;
        for(int i=0;i<t;i++){
            int min =i;
            for(int j = i+1;j<t;j++){
                if(array[j]>array[min]){
                    min =j;
                }
            }
            temp = array[i];
            array[i]= array[min];
            array[min]= temp;
        }
        for(int i=0;i<t;i++){
            System.out.print(array[i]+" ");
        }
    }
}
