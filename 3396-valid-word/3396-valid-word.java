class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        if(n<3) return false;
        int v=0;
        int con=0;
        for(char c:word.toCharArray()){
            if(c=='@' || c=='#' || c=='$') return false;
            if(isvowel(c)) v=1;
            else if(!isnum(c)) con=1;
        }
        if(v==1 && con==1) return true;
        return false;
    }
    private boolean isvowel(char c){
        if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'
        || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') return true;
        return false;
    }
    private boolean isnum(char c){
        if(c>='0' && c<='9') return true;
        return false;
    }
}