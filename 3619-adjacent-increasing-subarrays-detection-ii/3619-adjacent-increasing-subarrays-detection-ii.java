class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int count=0, max=0;
        int n=nums.size();
        int temp=0;
        for(int i=0; i<n-1; i++){
            int t=1;
            int a=i;
            for(int j=i; j<n-1; j++){
                if(nums.get(j)<nums.get(j+1)){
                    t++;
                    a++;
                }else break;
            }
            count =Math.max(count, Math.min(t,temp));
            int t1=1;
            int a1=a+1;
            for(int j=a+1; j<n-1; j++){
                if(nums.get(j)<nums.get(j+1)){
                    t1++;
                    a1++;
                }else break;
            }
            temp=t1;
            i=a1;
            max=Math.max(max,Math.max(t1,t));
            count =Math.max(count, Math.min(t1,t));
        }
        return Math.max(count,max/2);
    }
}