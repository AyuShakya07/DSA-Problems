class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        int sum2=0;
        int diff=0;
        int count=0;
        
        for(int i=0; i<n-1; i++){
            sum2+=nums[i];
            sum-=nums[i];
            diff=Math.abs(sum-sum2);
            if(diff%2==0){
                count++;
            }
        }
        return count;
    }
}