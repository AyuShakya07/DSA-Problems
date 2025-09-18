class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(s);
        Arrays.sort(g);
        int j=0;
        for (int i = 0; i<g.length && j<s.length;){
            if(g[i]<=s[j]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}