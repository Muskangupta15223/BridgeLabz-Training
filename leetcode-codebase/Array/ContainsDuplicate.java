import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate obj = new ContainsDuplicate();

        int[] nums1 = { 1, 2, 3, 1 };
        int[] nums2 = { 1, 2, 3, 4 };

        System.out.println("Contains Duplicate (nums1): " + obj.containsDuplicate(nums1));
        System.out.println("Contains Duplicate (nums2): " + obj.containsDuplicate(nums2));
    }
}
