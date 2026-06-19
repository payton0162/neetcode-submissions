class Solution {
    public int search(int[] nums, int target) {
        int index1 = 0;
        int index2 = nums.length - 1;
        
        while (index1 <= index2) {
            int mid = index1 + (index2 - index1) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                index1 = mid + 1;

            } else if (nums[mid] > target) {
                index2 = mid - 1;
            }
        }
        return -1;
    }
    
}
