import java.util.*;
public class FirstElementToOccurKTime {
    public static int firstelement(int array[] ,int n, int k ){
        HashMap<Integer,Integer> count_map = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            if(count_map.containsKey(array[i]))
            {

                count_map.put(array[i], count_map.get(array[i])+1);
            }
            else
                count_map.put(array[i], 1);
        }
        for (int i = 0; i < n; i++) // if count of element == k ,then
        // it is the required first element
        {
            if (count_map.containsKey(array[i]) )
            {
                if(count_map.get(array[i]) == k)
                    return array[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k  = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(firstelement(array ,n , k));
    }
}
