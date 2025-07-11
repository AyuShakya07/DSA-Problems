class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map =new HashMap<>();

        int sum=0;
        for(int i=0; i<n; i++){
            sum+=nums[i];
            int rem=sum%k;
            if(rem==0 && i>0) return true;
            if(map.containsKey(rem)){
                if(i-map.get(rem)>1) return true;
            }else{
                map.put(rem,i);
            }

        }
        return false;
    }
}