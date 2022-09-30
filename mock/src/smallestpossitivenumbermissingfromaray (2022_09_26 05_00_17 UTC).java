import java.util.*;
public class smallestpossitivenumbermissingfromaray {
    public static int solution(int[] arr,int n)
    {
        int N=1000010;
        boolean[] present = new boolean[N];
        int maxelement=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n)
                present[arr[i]] = true;

            maxelement=Math.min(maxelement,arr[i]);
        }

        for (int i = 1; i < N; i++)
            if (!present[i])
                return i;

        return maxelement+1;
    }

    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        // int missing =missingNumber(arr,n);
        // System.out.println(missing);
        System.out.println(solution(arr,n));
    }
}

