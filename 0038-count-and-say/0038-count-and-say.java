class Solution {
    public String countAndSay(int n) {
         StringBuilder ans=new StringBuilder("1");

        int count=1;
        while(n>1){
            StringBuilder sb=new StringBuilder(ans);
            ans.setLength(0);
            int x=sb.length();
            for(int i=0; i<x; i++){
                char c=sb.charAt(i);
                if(i<x-1 && c==sb.charAt(i+1)){
                    count++;
                }
                else{
                    ans.append((char)('0'+count));
                    ans.append(c);
                    count=1;
                }
                
            }
            n--;
        }
        return ans.toString();
    }
}