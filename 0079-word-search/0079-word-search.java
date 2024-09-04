class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean ans = helper(board,i,j,word,0);
                    if(ans==true){
                        return true;
                    }
                }
            }
        }
        return false;
        
    }
    private static boolean helper(char[][] arr,int cr,int cc,String word,int idx){
        if(idx==word.length()){
            return true;
        }

        if(cr<0 || cr>=arr.length || cc<0 || cc>=arr[0].length || arr[cr][cc]!=word.charAt(idx)){
            return false;
        }
        int[] r={-1,1,0,0};
        int[] c={0,0,-1,1};

        arr[cr][cc]='*';
        for(int i=0;i<c.length;i++){
            boolean ans=helper(arr, cr+r[i], cc+c[i], word, idx+1);
            if(ans==true){
                return ans;
            }
        }
        arr[cr][cc]=word.charAt(idx);
        return false;


    }
}