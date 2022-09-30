import java.util.*;
public class binarysearchlastelement {
    public static void main(String [] args){
        int array[] = {1 ,3, 5, 5, 5, 5,67 ,123 ,127 };
        int search = 5;

        int starting = 0;
        int high = array.length-1;
        int index = -1;

        while(starting<=high){
            int mid = (starting + high)/2;
            if(array[mid] == search){
                index = mid;
                starting = mid+1;
            }
            else if(array[mid]<search){
                starting = mid +1;
            }
            else{
                high = mid-1;
            }
        }

        System.out.println(index);
    }
}
