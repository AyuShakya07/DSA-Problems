class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int[] freq=new int[26];
        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int min=501;
                int max=0;
                freq[s.charAt(j)-'a']++;
                for(int k=0; k<26; k++){
                    if(freq[k]!=0){
                        max=Math.max(max,freq[k]);
                        min=Math.min(min,freq[k]);
                    }
                }
                sum+=max-min;
            }
            Arrays.fill(freq,0);
        }
        return sum;
    }
}