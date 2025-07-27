class Solution {
    public int countHillValley(int[] nums) {
        int n=nums.length;
        int count=0;
        
        for(int i=1; i<n-1; i++){
            if((nums[i]>nums[i-1] && nums[i]>nums[i+1]) ||
                    (nums[i]<nums[i-1] && nums[i]<nums[i+1])) count++;
            else if(nums[i]>nums[i-1]){
                for(int j=i+1; j<n; j++){
                    if(nums[i]>nums[j]){
                        count++;
                        break;
                    }
                    if(nums[i]<nums[j]) break;
                }
            }
            else if(nums[i]<nums[i-1]){
                for(int j=i+1; j<n; j++) {
                    if (nums[i] < nums[j]) {
                        count++;
                        break;
                    }
                    if(nums[i]>nums[j]) break;
                }
            }
        }
        return count;
    }
}