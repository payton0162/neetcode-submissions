class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int midpoint = left + (right - left) / 2;
            
            // 1. Success condition: Did we find the target?
            if (nums[midpoint] == target) {
                return midpoint;
            }

            // 2. Identify Territory: Is the left side normally sorted?
            if (nums[left] <= nums[midpoint]) {
                
                // Boundary Check: Is the target physically trapped in the left side?
                if (target >= nums[left] && target < nums[midpoint]) {
                    right = midpoint - 1; // Yes -> Search left
                } else {
                    left = midpoint + 1;  // No -> Search right
                }
                
            } 
            // 3. Otherwise, the right side MUST be normally sorted
            else {
                
                // Boundary Check: Is the target physically trapped in the right side?
                if (target > nums[midpoint] && target <= nums[right]) {
                    left = midpoint + 1;  // Yes -> Search right
                } else {
                    right = midpoint - 1; // No -> Search left
                }
            }
        }
        
        // Target was never found
        return -1;
    }
}