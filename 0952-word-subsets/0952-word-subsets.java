class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans=new ArrayList<>();
        int[] freq=new int[26];
        for(String s:words2){
            int[] temp=new int[26];
            for(char c:s.toCharArray()){
                temp[c-'a']++;
                freq[c-'a']=Math.max(freq[c-'a'],temp[c-'a']);
            }
        }
        for(String s:words1){
            int[] temp=new int[26];
            for(char c:s.toCharArray()){
                temp[c-'a']++;
            }
            boolean f=true;
            for(int i=0; i<26; i++){
                if(freq[i]>temp[i]){
                    f=false;
                    break;
                }
            }
            if(f) ans.add(s);
        }
        return ans;
    }
}