class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans=new ArrayList<>();
        int m=pattern.length();
        int upper=0;
        for(char c:pattern.toCharArray()){
            if(Character.isUpperCase(c)) upper++;
        }
        for(String s:queries){
            int n=s.length(); 
            int x=0;
            int i=0;
            int supper=0;
            for( i=0; x<n; ){
                char a=s.charAt(x);
                if(Character.isUpperCase(a)) supper++;
                if(i<m && a==pattern.charAt(i)){
                    i++;
                    x++;
                }
                else {
                    x++;
                }
            }
            if(i==m && upper==supper) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}