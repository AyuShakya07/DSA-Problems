class Solution {
    public int maxDepth(String s) {
        // Stack<Character> st=new Stack<>();
        // int depth=0;

        // for(char c:s.toCharArray()){
        //     if(c=='('){
        //         st.push(c);
        //     }else if(c==')'){
        //         depth=Math.max(depth,st.size());
        //         st.pop();
        //     }
        // }
        // return depth;

        int opencount=0;
        int depth=0;

        for(char c:s.toCharArray()){
            if(c=='('){
                opencount++;
            }else if(c==')'){
                depth=Math.max(depth,opencount);
                opencount--;
            }
        }
        return depth;
    }
}