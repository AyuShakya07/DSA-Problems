class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans=new int[2];

        for(int i=1; i<n; i++){
            if(noZero(i) && noZero(n-i)){
                ans[0]=i;
                ans[1]=n-i;
                break;
            }
        }
        return ans;
    }
    private boolean noZero(int n){
        while(n>0){
            if(n % 10 == 0) return false;
            n/=10;
        }
        return true;
    }
}