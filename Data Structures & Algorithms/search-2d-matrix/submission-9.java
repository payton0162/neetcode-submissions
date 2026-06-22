class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int total_rows = matrix.length;
        int total_cols = matrix[0].length;
        int top = 0;
        int bot = total_rows - 1; 
        int left = 0;
        int right = total_cols - 1;
        int mid_row = top + (bot - top)/2;

        while(top <= bot){
            mid_row = top + (bot - top)/2;
            int left_edge = matrix[mid_row][0];
            int right_edge = matrix[mid_row][total_cols-1];

            if(target > right_edge){
                top = mid_row + 1;
            } else if (target < left_edge){
                bot = mid_row - 1;
            } else {
                break; 
            }
        }
        if (top > bot){
            return false;
        }
        while (left <= right){
            int mid_col = left + (right - left)/2;
            
            if (matrix[mid_row][mid_col] == target){
                return true;
            } else if (matrix[mid_row][mid_col] < target){
                left = mid_col + 1;
            } else if (matrix[mid_row][mid_col] > target){
                right = mid_col - 1;
            }


        }
        return false; 
    }
}
