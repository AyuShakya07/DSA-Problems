class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();

        for(char c:s.toCharArray()){
            int n=sb.length();
            if(c=='*'){
                if(n>0) sb.delete(n-1,n);
            }
            else if(c=='#') sb.append(sb);
            else if(c=='%') sb.reverse();
            else sb.append(c);
        }
        return sb.toString();
    }
}