class Solution {
    public int numberOfBeams(String[] bank) {
        int last=0;
        int ans=0;
        for(String s:bank){
            int one=0;
            for(char c:s.toCharArray()){
                if(c=='1') one++;
            }
            ans+=(last*one);
            if(one>0) last=one;
        }
        return ans;
    }
}