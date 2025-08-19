class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long sub=0;
        long count=0;
        for(int v:nums){
            if(v==0){
                count++;
            }else{
                sub+=count*(count+1)/2;
                count=0;
            }
        }
        sub+=count*(count+1)/2;
        return sub;
    }
}