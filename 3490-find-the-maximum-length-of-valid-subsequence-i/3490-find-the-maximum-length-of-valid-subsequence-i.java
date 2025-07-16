class Solution {
    public int maximumLength(int[] nums) {
        int n=nums.length;
        int even=0;
        int odd=0;
        int sumeven=1, l1=0;
        int sumodd=1, l2=0;
        for(int i=0; i<n-1; i++){
            if(nums[i]%2==0) even++;
            else odd++;
            if((nums[l1]+nums[i+1])%2==0){
                sumeven++;
                l1=i+1;
            }
            if((nums[l2]+nums[i+1])%2!=0){
                sumodd++;
                l2=i+1;
            }
        }
        if(nums[n-1]%2==0) even++;
        else odd++;
        return Math.max(even,Math.max(odd,Math.max(sumeven,sumodd)));
    }
}