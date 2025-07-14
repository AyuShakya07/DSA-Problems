class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] ans=new int[rows*cols][2];
        int step=0;
        int x=1;
        char dir='e';

        ans[0][0]=rStart;
        ans[0][1]=cStart;

        while(x < rows*cols){
            if(dir=='e' || dir=='w'){
                step++;
            }
            for(int i=0; i<step; i++){
                if(dir=='e') cStart++;
                else if(dir=='w') cStart--;
                else if(dir=='n') rStart--;
                else rStart++;

                if(rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols){
                    ans[x][0]=rStart;
                    ans[x][1]=cStart;
                    x++;
                }
            }
            if(dir=='e') dir='s';
            else if(dir=='s') dir='w';
            else if(dir=='w') dir='n';
            else dir='e';
        }
        return ans;
    }
}