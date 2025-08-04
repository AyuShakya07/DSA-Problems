class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        if(n<=2) return n;
        int[] basket=new int[2];
        basket[0]=fruits[0];
        basket[1]=fruits[1];
        int ans=0;
        int count=2;
        for(int i=2; i<n; i++){
            if(fruits[i]==basket[0] || fruits[i]==basket[1]){
                count++;
            }else{
                ans=Math.max(count,ans);
                count=2;
                basket[0]=fruits[i-1];
                basket[1]=fruits[i];
                int x=i-2;
                while(x>=0 && fruits[x--]==basket[0]) count++;
            }
        }
        return Math.max(ans,count);
    }
}