class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n=answerKey.length();
        int t=0;
        int f=0;
        int left=0;
        int max=0, ans=0;

        for(int right=0; right<n; right++){
            if(answerKey.charAt(right)=='T') t++;
            else f++;
            max=Math.max(f,t);
            if(right-left-max+1 <= k){
                ans=Math.max(ans,right-left+1);
            }
            else{
                while(right-left-max+1 > k){
                    if(answerKey.charAt(left)=='T') t--;
                    else f--;
                    max=Math.max(f,t);
                    left++;
                }
            }
        }
        return ans;
    }
}