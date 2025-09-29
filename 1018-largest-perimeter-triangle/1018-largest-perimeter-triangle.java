class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int peri=0;
        int n=nums.length;

        for(int i=n-2; i>0; i--){
            if(nums[i-1]+nums[i]>nums[i+1]){
                return nums[i-1]+nums[i]+nums[i+1];
            }
        }
        return peri;
    }
}