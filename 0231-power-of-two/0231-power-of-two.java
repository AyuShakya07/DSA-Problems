class Solution {
    public boolean isPowerOfTwo(int n) {
        // int a=2;
        // if(n==1){
        //     return true;
        // }
        // if(n<=0) return false;
        // if(a==n){
        //     return true;
        // }if(a!=n){
        //     a=a<<1;
        //     if(a==n){
        //         return true;
        //     }else if (n%2==0){
        //         return isPowerOfTwo(n/2);
        //     }
        // }
        // return false;
        if(n>0 && (n&(n-1))==0) return true;
        return false;
    } 
}