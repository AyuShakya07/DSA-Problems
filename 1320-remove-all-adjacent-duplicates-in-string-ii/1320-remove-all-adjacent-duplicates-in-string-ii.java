class Solution {
    public class Pair{
        int count;
        char c;
        public Pair(int count, char c){
            this.count=count;
            this.c=c;
        }

    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st=new Stack<>();
        int count=1;
        for(char c:s.toCharArray()){
            if(!st.isEmpty() && st.peek().c==c){
                st.peek().count++;
            }
            else{
                st.push(new Pair(1,c));
            }
            if(st.peek().count==k){
                st.pop();
            }
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            int x=st.peek().count;
            char c=st.peek().c;
            st.pop();
            while(x>0){
                ans.append(c);
                x--;
            }
        }
        return ans.reverse().toString();
    }
}