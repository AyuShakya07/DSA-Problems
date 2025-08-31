class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[] ans=new int[m*n];

        int i=0;
        int r=0, c=0;
        int flag=0;
        while(i<m*n){
            ArrayList<Integer> temp=new ArrayList<>();
            int x=r,y=c;
            while(x>=0 && y<=m-1){
                if(flag%2==0){
                    ans[i++]=mat[x][y];
                }else{
                    temp.add(mat[x][y]);
                }
                x--;
                y++;
            }
            if(flag%2!=0){
                Collections.reverse(temp);
                for(int v:temp){
                    ans[i++]=v;
                }
            }
            if(r==n-1) c++;
            else r++;
            flag++;
        }
        return ans;
    }
}