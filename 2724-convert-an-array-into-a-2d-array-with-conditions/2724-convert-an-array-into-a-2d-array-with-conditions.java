class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] freq=new int[201];
        List<List<Integer>> ans=new ArrayList<>();
        for(int v:nums){
            freq[v]++;
        }
        int n=freq.length;
        while(true){
            int i=0;
            List<Integer> temp=new ArrayList<>();
            while(i<n){
                if(freq[i]!=0){
                    temp.add(i);
                    freq[i]--;
                }
                i++;
            }
            if(temp.size()==0) break;
            ans.add(temp);
        }
        return ans;
    }
}