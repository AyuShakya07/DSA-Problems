class Solution {
    public int minimumArea(int[][] grid) {
        int top=grid.length, bottom=0;
        int left=grid[0].length, right=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j]==1){
                    top=Math.min(top,i);
                    bottom=Math.max(bottom,i);
                    left=Math.min(left,j);
                    right=Math.max(right,j);
                }
            }
        }
        return (right+1-left)*(bottom+1-top);
    }
}