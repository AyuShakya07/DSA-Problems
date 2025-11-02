class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);

        int a=nums[0];
        int i=1;
        while(a<nums[n-1]){
            a++;
            if(nums[i]!=a){
                ans.add(a);
            }
            else if(i<n-1) i++;
        }
        return ans;
    }
}