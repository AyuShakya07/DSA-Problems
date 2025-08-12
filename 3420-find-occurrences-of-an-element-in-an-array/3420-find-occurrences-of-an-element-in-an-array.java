class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> pos=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]==x) pos.add(i);
        }
        int n=queries.length;
        int s=pos.size();
        int[] ans=new int[n];
        ans[0]=-1;
        for(int i=0; i<n; i++){
            if(s<queries[i]) ans[i]=-1;
            else ans[i]=pos.get(queries[i]-1);
        }
        return ans;
    }
}