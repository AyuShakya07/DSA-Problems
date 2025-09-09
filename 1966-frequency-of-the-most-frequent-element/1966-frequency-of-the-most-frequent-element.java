class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        // int freq=1;
        // for(int i=n-1; i>0; i--){
        //     int temp=1;
        //     int op=k;
        //     for(int j=i-1; j>=0; j--){
        //         op=op+(nums[j]-nums[i]);
        //         if(op>=0){
        //             temp++;
        //         }else break;
        //     }
        //     freq=Math.max(temp,freq);
        // }
        // return freq;


        int freq=1;
        long cursum=0;
        int right=n-1;
        for(int left=n-1; left>=0; left--){
            cursum+=nums[left];
            while(cursum+k < ((long) nums[right] *(right-left+1))) {
                cursum -= nums[right];
                right--;
            }
            freq=Math.max(freq,right-left+1);
        }
        return freq;
    }
}