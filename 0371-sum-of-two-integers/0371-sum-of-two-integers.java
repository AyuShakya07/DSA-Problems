class Solution {
    public int getSum(int a, int b) {
        int sum=0;
        while(b!=0){
            int c=(a & b) << 1;
            a=a^b;
            b=c;
        }
        return a;
    }
}