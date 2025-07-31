class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> ans=new HashSet<>();
        Set<Integer> pre=new HashSet<>();
        
        for(int n:arr){
            Set<Integer> temp=new HashSet<>();
            temp.add(n);
            for(int v:pre) temp.add(v|n);

            for(int v:temp) ans.add(v);

            pre=temp;
        }
        return ans.size();
    }
}