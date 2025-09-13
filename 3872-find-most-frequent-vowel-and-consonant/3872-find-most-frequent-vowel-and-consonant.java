class Solution {
    public int maxFreqSum(String s) {
        int[] freq=new int[26];

        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }

        int vowel=0;
        int conso=0;

        for(int i=0; i<26; i++){
            if('a'-'a'==i || 'e'-'a'==i || 'i'-'a'==i || 'o'-'a'==i || 'u'-'a'==i){
                vowel=Math.max(vowel,freq[i]);
            }else{
                conso=Math.max(conso,freq[i]);
            }
        }
        return vowel + conso;
    }
}