class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int count=0;
        int l=0;
        boolean a=false, b=false, c=false;

        for(int i=0; i<=n-3; i++){
            for(int j=i; j<n; j++){
                char x=s.charAt(j);
                if(x=='a') a=true;
                else if(x=='b') b=true;
                else c=true;

                if(a && b && c){
                    l=Math.max(l,j);
                    count+=n-l;
                    break;
                }
            }
            char y=s.charAt(i);
            if(y=='a') a=false;
            else if(y=='b') b=false;
            else c=false;
        }
        return count;
    }
}