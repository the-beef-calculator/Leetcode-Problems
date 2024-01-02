import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
    }

    public boolean containsDuplicate(int[] nums)
    {
        HashSet<Integer> set = new HashSet<>();
        int length = nums.length;

        for (int i = 0; i < length; i++)
        {
            if (set.contains(nums[i]))
            {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}