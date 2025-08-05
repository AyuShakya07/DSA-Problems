class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int ans=0;
        for(int j=0; j<n; j++){
            int v=fruits[j];
            for(int i=0; i<n; i++){
                int x=baskets[i];
                if(x!=0 && x>=v){
                    baskets[i]=0;
                    fruits[j]=0;
                    break;
                }
            }
            if(fruits[j]!=0) ans++;
        }
        return ans;
    }
}