class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long ans=0;
        for(int i=0; i<n; i++){
            int max=nums[i];
            int min=nums[i];
            for(int j=i+1; j<n; j++){
                max=Math.max(nums[j],max);
                min=Math.min(nums[j],min);
                ans+=max-min;
            }
        }
        return ans;
    }
}