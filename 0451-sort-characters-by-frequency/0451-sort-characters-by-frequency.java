class Solution {
    public String frequencySort(String s) {
        int[][] freq=new int[62][2];
        for(char c:s.toCharArray()){
            if (c >= 'A' && c <= 'Z') {
                freq[c - 'A'][0]++;
                freq[c - 'A'][1]=c;

            } else if (c >= 'a' && c <= 'z') {
                freq[c - 'a' + 26][0]++;
                freq[c - 'a' + 26][1]=c;
            }else{
                freq[c - '0' + 52][0]++;
                freq[c - '0' + 52][1]=c;
            }
        }
        Arrays.sort(freq, (a, b) -> b[0] - a[0]);

        StringBuilder ans=new StringBuilder();
        for(int[] arr:freq){
            for(int i=0; i<arr[0]; i++){
                ans.append((char)arr[1]);
            }
        }
        return ans.toString();
    }
}