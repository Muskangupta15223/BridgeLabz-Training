import java.util.*;
class TwoSum{
    public static int[] findTwoSum(int[] nums, int target) {
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of ellements in arrays");
		int n = sc.nextInt();
		int[] nums = new int[n]; 
		System.out.println("Enter arrays value");
		for(int i = 0; i < n; i++){
			nums[i] = sc.nextInt();
		}
		System.out.println("Enter target value");
		int target = sc.nextInt();
		System.out.println(Arrays.toString(findTwoSum(nums, target)));
	}
}