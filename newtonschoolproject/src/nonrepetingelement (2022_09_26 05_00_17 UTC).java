import java.util.Arrays;

public class nonrepetingelement {
    public static void main(String args[]) {

    int [] nums = {100, 20, 30, 30, 1000, 40,100, 20};

        Arrays.sort(nums);
        if(nums[0] != nums[1])
            System.out.print(nums[0]+" ");

        for(int i=1;i<nums.length-1;i++)
            if(nums[i-1]!=nums[i] && nums[i]!=nums[i+1])
            System.out.print(nums[i]+" ");
}
}

