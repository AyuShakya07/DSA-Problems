class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;

        int[] ans=new int[n-k+1];
        int y=0;
        for(int i=0; i<n-k+1; i++){
            int[][] temp=new int[51][2];
            for(int j=i; j<i+k; j++){
                temp[nums[j]][0]=nums[j];
                temp[nums[j]][1]++;
            }
            Arrays.sort(temp, new Comparator<int[]>(){
                public int compare(int[] a, int[] b){
                    if(a[1]!=b[1]){
                        return Integer.compare(b[1],a[1]);
                    }
                    return Integer.compare(b[0],a[0]);
                }
            });
            int sum=0;
            for(int j=0; j<x; j++){
                for(int l=0; l<temp[j][1]; l++){
                    sum+=temp[j][0];
                }
            }
            ans[y++]=sum;
        }
        return ans;
    }
}