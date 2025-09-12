class Solution {
    public boolean doesAliceWin(String s) {
        int vowelCount=0;
        for(char c:s.toCharArray()){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowelCount++;
            }
        }
        if(vowelCount==0) return false;
        else return true;
    }
}