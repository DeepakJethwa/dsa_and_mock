import java.util.*;
public class bubbesortdiscending {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int array[] = new int [t];
        for(int i =0; i<t;i++){
            array[i]= sc.nextInt();
        }
       int temp =0;
        for(int i=0;i<t;i++){
            for(int j=1;j<t-i;j++){
                if(array[j-1]<array[j]){
                  temp =  array[j-1];
                  array[j-1]= array[j];
                  array[j]= temp;
                }
            }
        }
        for(int i=0;i<t;i++){
            System.out.print(array[i]+" ");
        }
    }
}
