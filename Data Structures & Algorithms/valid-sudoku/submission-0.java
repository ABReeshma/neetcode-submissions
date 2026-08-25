class Solution {
    public boolean isValidSudoku(char[][] board) {
       for(int i=0;i<9;i++){
            HashSet<Character> set=new HashSet<>();
            for(int j=0;j<9;j++){
                char val=board[i][j];
                if(val!='.'&& set.contains(val)){
                    return false;
                }
                set.add(val);
            }
        }
        for(int i=0;i<9;i++){
            HashSet<Character> set1=new HashSet<>();
            for(int j=0;j<9;j++){
                char val=board[j][i];
                if(val!='.'&& set1.contains(val)){
                    return false;  
                }
                set1.add(val);
            }
        }

        for(int box=0;box<9;box++){
            HashSet<Character> set2=new HashSet<>();
            for(int k=0;k<9;k++){
                int row=3*(box/3)+k/3;
                int col=3*(box%3)+k%3;
                char val=board[row][col];
                if(val!='.'&& set2.contains(val)){
                    return false;  
                }
                set2.add(val);
            }
        } 
        return true;   
    }
}

