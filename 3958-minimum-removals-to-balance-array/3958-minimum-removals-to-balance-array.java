class Solution {
    public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int size=0;

        int j=0;
        for(int i=0; i<n; i++){
            while(nums[i]>(long)nums[j]*k) j++;
            size=Math.max(size,i-j+1);
        }
        return n-size;
    }
}