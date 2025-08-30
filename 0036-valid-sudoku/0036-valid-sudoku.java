class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(char[] arr:board){
            Set<Character> s=new HashSet<>();
            for(char c: arr){
                if(c!='.' && !s.add(c)) return false;
            }
        }

        for(int i=0; i<9; i++){
            Set<Character> s=new HashSet<>();
            for(int j=0; j<9; j++){
                char c=board[j][i];
                if(c!='.' && !s.add(c)) return false;
            }
        }
        for(int i=0; i<9; i+=3){
            Set<Character> s=new HashSet<>();
            for(int j=i; j<i+3; j++){
                for(int k=0; k<3; k++){
                    char c=board[j][k];
                    if(c!='.' && !s.add(c)) return false;
                }
            }
            s.clear();
            for(int j=i; j<i+3; j++){
                for(int k=3; k<6; k++){
                    char c=board[j][k];
                    if(c!='.' && !s.add(c)) return false;
                }
            }
            s.clear();
            for(int j=i; j<i+3; j++){
                for(int k=6; k<9; k++){
                    char c=board[j][k];
                    if(c!='.' && !s.add(c)) return false;
                }
            }
        }
        return true;
    }
}