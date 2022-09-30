import java.util.*;
public class selectionsortassending {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        int array[] = new int [t];
        for(int i =0; i<t;i++){
            array[i]= sc.nextInt();
        }
        /*
        1 2 3 4 5 8
        8 2 3 4 5 1
        8 5 2 3 4 1
        8 5 4 3 2 1
        8 5 4 3 2 1
         */
        int temp=0;

        for(int i=0;i<t;i++) {
            int min = i;
            for (int j = i + 1; j < t; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        for(int i=0;i<t;i++) {
            System.out.print(array[i]+" ");
        }
        }


    }
