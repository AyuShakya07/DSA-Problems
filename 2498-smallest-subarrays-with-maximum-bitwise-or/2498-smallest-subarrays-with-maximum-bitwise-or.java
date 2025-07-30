class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] bitind=new int[32];
        Arrays.fill(bitind,-1);

        for(int i=n-1; i>=0; i--){
            int x=nums[i];
            for(int j=0; j<32; j++){
                if(((x>>j) & 1)==1){
                    bitind[j]=i;
                }
            }
            int maxind=i;
            for(int k=0; k<32; k++){
                maxind=Math.max(maxind,bitind[k]);
            }
            ans[i]=maxind-i+1;
        }
        return ans;
    }
}