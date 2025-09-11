class Solution {
    public String sortVowels(String s) {
        int[] freq=new int[122];
        for(char c:s.toCharArray()){
            if(isvowel(c)){
                freq[c]++;
            }
        }
        char[] vowel={'A','E','I','O','U','a','e','i','o','u'};
        StringBuilder ans=new StringBuilder();
        int i=0;
        for(char c:s.toCharArray()){
            if(!isvowel(c)){
                ans.append(c);
            }
            else{
                while(i<10 && freq[vowel[i]]==0) i++;
                ans.append(vowel[i]);
                freq[vowel[i]]--;
            }
        }
        return ans.toString();
    }
    private boolean isvowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'
        || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        return false;
    }
}