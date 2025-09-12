class Solution {
    public boolean doesAliceWin(String s) {
        String vowel="aeiou";
        int vowelCount=0;
        for(char c:s.toCharArray()){
            if(vowel.contains(String.valueOf(c))){
                vowelCount++;
            }
        }
        if(vowelCount==0) return false;
        else return true;
    }
}