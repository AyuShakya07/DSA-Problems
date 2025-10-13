class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n=words.length;
        List<String> ans=new ArrayList<>();

        for(int i=0; i<n; i++){
            if(words[i].isEmpty()) continue;
            ans.add(words[i]);
            char[] t1=words[i].toCharArray();
            Arrays.sort(t1);
            for(int j=i+1; j<n; j++){
                char[] t2=words[j].toCharArray();
                Arrays.sort(t2);

                if(Arrays.equals(t1, t2)){
                    words[j]="";
                }else break;
            }
        }
        return ans;
    }
}