import java.util.*;
public class leaderinanarray {
    public static void printLeaders(int arr[], int size)
    {
        int max_from_right =  arr[size-1];

        /* Rightmost element is always leader */
        System.out.print(max_from_right + " ");

        for (int i = size-2; i >= 0; i--)
        {
            if (max_from_right < arr[i])
            {
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
        }
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        int arr[] = {18, 17, 4, 6, 5, 2};
        int n = arr.length;
        printLeaders(arr, n);
    }
}

