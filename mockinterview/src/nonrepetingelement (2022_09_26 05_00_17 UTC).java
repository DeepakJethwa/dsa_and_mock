import java.util.Arrays;
import java.util.Scanner;
public class nonrepetingelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        for(int i=1;i<nums.length-1;i++)
            if(nums[i-1]!=nums[i] && nums[i]!=nums[i+1])
                System.out.print(nums[i]+" ");
            }
        }

