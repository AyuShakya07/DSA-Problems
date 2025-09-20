class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n1=s.length();
        int n2=words.size();
        if(n1!=n2) return false;
        int i=0;
        for(String str : words){
            if(str.charAt(0)!=s.charAt(i)){
                return false;
            }
            i++;
        }
        return true;
    }
}