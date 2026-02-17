class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length-1;
        int r=0;
        while(r<row && col>=0){
            if(target>matrix[r][col]){
                r++;
            }else{
                if(target<matrix[r][col]){
                    col--;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}