class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        int s=0;
        int l=0;
        int ans=0;
        int sum=0;
        while(l<n){
            if(set.add(nums[l])){
                sum+=nums[l];
                l++;
                ans=Math.max(sum,ans);
            }else{
                set.remove(nums[s]);
                sum-=nums[s];
                s++;
            }
        }
        return ans;
    }
}