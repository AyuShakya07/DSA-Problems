class Solution {
    public int maximumGain(String s, int x, int y) {
        int ans=0;
        if(x>=y){
            ans=forab(s,x,y);
        }else{
            ans=forba(s,x,y);
        }
        return ans;
    }
    private int forab(String s, int x,int y){
        int n=s.length();
        int sum=0;
        Stack<Character> st=new Stack<>();
        Stack<Character> s2=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1; i<n; i++){
            char c=s.charAt(i);
            if(!st.isEmpty() && c=='b' && st.peek()=='a'){
                sum+=x;
                st.pop();
            }else{
                st.push(c);
            }
        }
        if(!st.isEmpty()) s2.push(st.pop());
        while(!st.isEmpty()){
            char c=st.pop();
            if(!s2.isEmpty() && c=='b' && s2.peek()=='a'){
                s2.pop();
                sum+=y;
            }
            else{
                s2.push(c);
            }
        }
        return sum;
    }
    private int forba(String s, int x,int y){
        int n=s.length();
        int sum=0;
        Stack<Character> st=new Stack<>();
        Stack<Character> s2=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1; i<n; i++){
            char c=s.charAt(i);
            if(!st.isEmpty() && c=='a' && st.peek()=='b'){
                sum+=y;
                st.pop();
            }else{
                st.push(c);
            }
        }
        if(!st.isEmpty()) s2.push(st.pop());
        while(!st.isEmpty()){
            char c=st.pop();
            if(!s2.isEmpty() && c=='a' && s2.peek()=='b'){
                s2.pop();
                sum+=x;
            }
            else{
                s2.push(c);
            }
        }
        return sum;
    }
}