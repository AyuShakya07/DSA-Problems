class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {

        Stack<Integer> st=new Stack<>();
        
        for(int n:nums){
            int val=n;
            
            while(!st.isEmpty() && gcd(st.peek(),val) > 1){
                val=lcm(st.pop(),val);
            }
            st.push(val);

        }
        return new ArrayList<>(st);
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    private int lcm(int a, int b) {
        return a/ gcd(a,b)*b;
    }
}