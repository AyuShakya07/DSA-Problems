class Solution {
    public int longestSubarray(int[] nums) {
        int ans=0;
        int s=0, e=0;
        int zero=0;
        while(e<nums.length){
            if(nums[e]==0){
                zero++;
            }
            while(zero>1){
                if(nums[s]==0){
                    zero--;
                }
                s++;
            }
            ans=Math.max(ans,e-s);
            e++;
        }
        return ans;
    }
}