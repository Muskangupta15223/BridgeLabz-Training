import java.util.*;
class MoveZeroes {
    public static int[] isMoveZeroes(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums;   
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0)  nums[idx++] = nums[i];
        } 
        while (idx < nums.length) {
            nums[idx++] = 0;
         }
	return nums;
    }
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++){
			System.out.println("Enter arrays element: ");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(isMoveZeroes(arr)));


	}
}