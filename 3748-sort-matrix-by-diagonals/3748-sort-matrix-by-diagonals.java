class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        int[][] ans=new int[n][n];

        for(int i=0; i<n-1; i++){
            List<Integer> arr=new ArrayList<>();
            int r=0;
            for(int j=i+1; j<n; j++){
                arr.add(grid[r][j]);
                r++;
            }
            r=0;
            Collections.sort(arr);
            for(int j=i+1; j<n; j++){
                grid[r][j]=arr.get(r);
                r++;
            }
            arr.clear();
            int c=0;
            for(int j=i; j<n; j++){
                arr.add(grid[j][c]);
                c++;
            }
            c=0;
            Collections.sort(arr,Collections.reverseOrder());
            for(int j=i; j<n; j++){
                grid[j][c]=arr.get(c);
                c++;
            }
        }
        return grid;
    }
}