class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n=nums.length;
        int res=1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n && j<i+30; j++){
                if(isNice(nums,i,j)) res=Math.max(res,j+1-i);
                else break;
            }
        }
        return res;
    }
    private boolean isNice(int[] nums, int s, int e){
        for(int i=s; i<=e; i++){
            for(int j=i+1; j<=e; j++){
                if((nums[i] & nums[j]) !=0) return false;
            }
        }
        return true;
    }
}