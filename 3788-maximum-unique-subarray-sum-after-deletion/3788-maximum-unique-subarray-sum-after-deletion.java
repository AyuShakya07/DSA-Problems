class Solution {
    public int maxSum(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int max=-101;
        for(int i:nums){
            if(i>0) s.add(i);
            max=Math.max(max,i);
        }
        if(max<=0) return max;
        int sum=0;
        for(int i:s){
            sum+=i;
        }
        return sum;
    }
}