class Solution {
    public boolean hasSameDigits(String s) {
        int n=s.length();

        if(n==2 && s.charAt(0)==s.charAt(1)) return true;

        StringBuilder sb=new StringBuilder(s);

        while(sb.length()>2){
            StringBuilder temp=new StringBuilder();
            for(int i=0; i<sb.length()-1; i++){
                int d=(sb.charAt(i)-'0')+(sb.charAt(i+1)-'0');
                d=d%10;
                temp.append((char) (d+'0'));
            }
            sb=temp;
        }
        if(sb.charAt(0)==sb.charAt(1)) return true;
        else return false;
    }
}