class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        int x=1;
        for(int i=0; i<n/2; i++){
            ans[i]=x * -1;
            ans[n-1-i]=x;
            x++;
        }
        return ans;
    }
}