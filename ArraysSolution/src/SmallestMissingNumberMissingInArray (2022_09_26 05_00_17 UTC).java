import java.util.Scanner;
public class SmallestMissingNumberMissingInArray {
    public static int solution(int[] arr,int n)
    {
        int N=10000;
        boolean[] present = new boolean[N];
        int maxelement=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n)
                present[arr[i]] = true;

            maxelement=Math.max(maxelement,arr[i]);
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
