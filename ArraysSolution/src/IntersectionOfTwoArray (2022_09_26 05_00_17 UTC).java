import java.util.*;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer array1[] = new Integer[n];
        Integer array2[] = new Integer[m];
        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            array2[i] = sc.nextInt();
        }
//        HashSet<Integer> set = new HashSet<Integer>();
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array2.length; j++) {
//                if (array1[i] == (array2[j])){
//                    set.add(array1[i]);
//                }
//            }
//        }
//        System.out.println(set);

        HashSet<Integer> set1=  new HashSet<>(Arrays.asList(array1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(array2));
        set1.retainAll(set2);
        System.out.println(set1);
    }
}

