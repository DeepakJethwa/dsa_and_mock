import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class sumpairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
//
//        Arrays.sort(array);
//
//        int i = 0;
//        int j = array.length-1;
//
//        while (i < j)
//            if (array[i] + array[j] == k) {
//                System.out.println(array[i] + "," + array[j]);
//                i++;
//                j--;
//            } else if (array[i] + array[j] < k) {
//                i++;
//            } else if (array[i] + array[j] > k) {
//                j--;
//            }
//    }
//}


//
//        time complexity n2
//        int count = 0;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (array[i] + array[j] == k) {
//                    count++;
//                    System.out.println(array[i]+","+array[j]);
//                }
//            }
//        }
//    }
//}

//         method hashmap , time compleity n
//        HashMap<Integer , Integer> m= new HashMap<>();
//        int count =0;
//        for(int i=0;i<n;i++){
//            if(m.containsKey(k-array[i])){
//                count+=m.get(k-array[i]);
//            }
//            if(m.containsKey(array[i])){
//                m.put(array[i] , m.get(array[i])+1);
//            }
//            else{
//                m.put(array[i] , 1);
//            }
//        }
//        System.out.println(count);
//    }
//}

//        subarray sum equal to k
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += array[i];


//agar sum - target ki frequency hai to utna hi baar ham usko add kar le
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }

//            jate jate hm sum ki frequency badha denge
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
            System.out.println(ans);
    }
}