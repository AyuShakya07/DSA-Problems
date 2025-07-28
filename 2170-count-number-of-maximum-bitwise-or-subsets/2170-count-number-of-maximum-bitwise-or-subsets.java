class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxor=0;
        for(int i=0; i<nums.length; i++){
            maxor|=nums[i];
        }
        return count(nums, maxor, 0, 0);
    }
    private int count(int nums[], int maxor, int idx, int tempor){
        if(idx==nums.length){
            return maxor==tempor ? 1:0;
        }
        int x=count(nums,maxor,idx+1,tempor|nums[idx]);
        int y=count(nums,maxor,idx+1,tempor);
        
        return x+y;
    }
}