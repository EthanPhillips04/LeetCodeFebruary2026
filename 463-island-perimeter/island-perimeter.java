class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int rows = grid.length;
        int columns = grid[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(grid[i][j] == 1){
                    perimeter += 4;

                    // right
                    if(j != columns - 1 && grid[i][j+1] == 1){
                        perimeter -= 1;
                    }
                    // left
                    if(j != 0 && grid[i][j-1] == 1){
                        perimeter -= 1;
                    }
                    // down
                    if(i != rows - 1 && grid[i+1][j] == 1){
                        perimeter -= 1;
                    }
                    // up
                    if(i != 0 && grid[i-1][j] == 1){
                        perimeter -= 1;
                    }
                }
            }
        }
        return perimeter;
    }
}