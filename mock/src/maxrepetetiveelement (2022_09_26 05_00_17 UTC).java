import java.util.*;

public class maxrepetetiveelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i< n; i++)
            array[(array[i]% array.length)] += array.length;

        int max = array[1], result = 0;
        for (int i = 1; i < n; i++)
        {
            if (array[i] > max )
            {
                max = array[i];
                result = i;
            }
        }
        System.out.println(result);
        //leaders in an array
//        for (int i = 0; i < array.length; i++)
//        {
//            int j;
//            for (j = i + 1; j < array.length; j++)
//            {
//                if (array[i] <=array[j])
//                    break;
//            }
//            if (j == array.length)
//                System.out.print(array[i] + " ");
        }
    }

