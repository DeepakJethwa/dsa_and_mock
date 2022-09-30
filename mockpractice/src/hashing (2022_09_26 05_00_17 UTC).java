import java.util.*;
public class hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int array1[] = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        int array2[] = new int[m];
        for (int i = 0; i < m; i++) {
            array2[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();

        set.add(5);
        set.add(10);
        System.out.println(set);

        if (set.contains(10)) {
            System.out.println("present");
        } else {
            System.out.println("not present");
        }
        set.remove(10);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        int count = 0;
        for (int element1 : array1) {
            set.add(element1);
        }
        for (int element : array2) {
            if (set.contains(element)) {
                count++;
                set.remove(element);
            }
        }
        System.out.println(count);
    }
}



