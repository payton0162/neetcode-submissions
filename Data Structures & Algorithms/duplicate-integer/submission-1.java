class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer>duplicateChecker = new HashSet<Integer>();
       for (int n : nums){
            if(duplicateChecker.contains(n)){
                return true;
            } else {
                duplicateChecker.add(n);
            }



       }
       return false; 
    }
} 