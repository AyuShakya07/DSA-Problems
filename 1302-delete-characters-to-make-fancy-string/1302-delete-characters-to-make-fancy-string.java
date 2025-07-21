class Solution {
    public String makeFancyString(String s) {
        int n=s.length();
        int count=0;
        StringBuilder ans=new StringBuilder();
        ans.append(s.charAt(0));

        for(int i=1; i<n; i++) {
            char c = s.charAt(i);
            if (c == ans.charAt(ans.length()-1)){
                if(count<1){
                    count++;
                    ans.append(c);
                }
            }else{
                count=0;
                ans.append(c);
            }
        }
        return ans.toString();
    }
}