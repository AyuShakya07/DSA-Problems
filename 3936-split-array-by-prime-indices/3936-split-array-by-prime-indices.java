class Solution {
    public long splitArray(int[] nums) {
        int n=nums.length;
        boolean[] primes=new boolean[n];
        Arrays.fill(primes,true);
        primes[0]=false;
        if(n>1) primes[1]=false;
        for(int i=2; i*i<n; i++){
            if(primes[i]){
                for(int j=i*i; j<n; j+=i){
                    primes[j]=false;
                }
            }
        }
        long sum=0;
        long sumPrime=0;
        for(int i=0; i<n; i++){
            if(primes[i]) sumPrime+=nums[i];
            else sum+=nums[i];
        }
        return Math.abs(sum-sumPrime);
    }
}