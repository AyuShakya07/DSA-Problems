class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length;
        int m=potions.length;
        int[] ans=new int[n];

        for(int i=0; i<n; i++){
            int x=spells[i];
            long t=(success+x-1)/x;

            int idx=m;
            int s=0, e=m-1;

            while(s<=e){
                int mid=s+(e-s)/2;
                if(potions[mid]>=t){
                    idx=mid;
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
            ans[i]=m-idx;
        }
        return ans;
    }
}