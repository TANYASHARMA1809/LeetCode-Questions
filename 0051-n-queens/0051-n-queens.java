class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] arr=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]='.';
            }
        }
        printPath(arr,0,n,ans);
        return ans;
    }
    public static void printPath(char[][] arr,int row,int tq,List<List<String>> ans){
        if(tq==0){
            ans.add(Display(arr));
            return;
        }
        if(row==arr.length){
            return;
        }

        for(int col=0;col<arr.length;col++){
            if(isPossible(arr,row,col)==true){
                arr[row][col]='Q';
                printPath(arr,row+1,tq-1,ans);
                arr[row][col]='.';
            }
        
        }
    }
    private static boolean isPossible(char[][] arr,int row,int col){
        int r=row;
        //upper
        while(r>=0){
            if(arr[r][col]=='Q'){
                return false;
            }
            r--;
        }
        //left diagonal
        int c=col;
        r=row;
        while(r>=0 && c>=0){
            if(arr[r][c]=='Q'){
                return false;
            }
            r--;
            c--;
        }
        //right diagonal
        c=col;
        r=row;
        while(r>=0 && c<arr.length){
            if(arr[r][c]=='Q'){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    private static List<String> Display(char[][] arr){
        List<String> ll=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            String s=new String(arr[i]);
            ll.add(s);
        }
        return ll;
        
    }
}