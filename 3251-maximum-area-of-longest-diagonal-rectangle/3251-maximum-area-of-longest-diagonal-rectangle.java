import java.math.BigDecimal;
import java.math.MathContext;
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int dgl=0;
        int area=0;
        for(int i=0; i<dimensions.length; i++){
            int l=dimensions[i][0];
            int w=dimensions[i][1];
            int d=l*l + w*w;
            if(d>dgl){
                dgl=d;
                area=l*w;
            }else if(d==dgl){
                area=Math.max(area,l*w);
            }
        }
        return area;
    }
}