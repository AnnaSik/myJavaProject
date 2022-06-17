package school.lesson2;

public class Task7App {
    public static void main(String[] args)  {
        int[] nums = {1,5,3,2,11,4,5,2,4,8,9,1};
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 6) nums[i] = nums[i] * 2;
        }
        for(int i = 0; i < nums.length; i++)
        {
            System.out.print (nums[i]+" ");
        }
    }
}