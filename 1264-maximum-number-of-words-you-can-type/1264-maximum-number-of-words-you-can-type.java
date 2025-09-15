class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] broken=new boolean[26];

        for(char c: brokenLetters.toCharArray()){
            broken[c-'a']=true;
        }
        String[] word=text.split(" ");
        int count=0;
        for(String s:word){
            boolean temp=true;
            for(char c: s.toCharArray()){
                if(broken[c-'a']){
                    temp=false;
                    break;
                }
            }
            if(temp) count++;
        }
        return count;
    }
}