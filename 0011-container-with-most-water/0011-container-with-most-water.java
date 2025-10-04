class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int max=0;
        while(start<end){
            int length=end-start;
            if(height[start]<=height[end]){
                if(height[start]*length>max) {
                    max = height[start] * length;
                }
                start++;
            }
            else{
                if(height[end]*length>max) {
                    max = height[end] * length;
                }
                end--;
            }
        }
        return max;
    }
}