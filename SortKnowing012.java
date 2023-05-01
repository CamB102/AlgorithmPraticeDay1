package algorithmday1;

import java.util.Arrays;

public class SortKnowing012 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 0, 2, 2, 1, 0, 0 };

		sortNumber(nums);

		System.out.println(Arrays.toString(nums));

	}
 
	//bigO = n
	public static void sortNumber(int[] nums) {
		int low = 0;
		int mid = 0;
		int high = nums.length - 1;
		
		//(n-1)*11 => n
		while (mid <= high) {
			if (nums[mid] == 0) {
				nums[mid] = nums[low];
				nums[low] = 0;
				low++;
				mid++;
			} else if (nums[mid] == 1) {
				mid++;
			} else {
				nums[mid] = nums[high];
				nums[high] = 2;
				high--;
			}
		}
	}

}
