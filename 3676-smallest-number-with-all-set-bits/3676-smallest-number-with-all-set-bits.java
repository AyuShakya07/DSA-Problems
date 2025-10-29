class Solution {
    public int smallestNumber(int n) {
        // int ans;
        // while(true){
        //     if(set(n)){
        //         ans=n;
        //         break;
        //     }
        //     n++;
        // }
        // return ans;

        int x=1;
        while(n>x){
            x=(x*2)+1;
        }
        return x;
    }
    // boolean set(int a){
    //     while(a>0){
    //         if((a&1)==0) return false;
    //         a>>=1;
    //     }
    //     return true;
    // }
    
}