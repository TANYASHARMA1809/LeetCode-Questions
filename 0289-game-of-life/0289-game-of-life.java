class Solution {
    public void gameOfLife(int[][] arr) {
        int[][] maze=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                maze[i][j]=arr[i][j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    if(lives(i,j,maze)==2 || lives(i,j,maze)==3){
                        arr[i][j]=1;
                    }else{
                        arr[i][j]=0;
                    }
                }else{
                    if(lives(i,j,maze)==3){
                        arr[i][j]=1;
                    }else{
                        arr[i][j]=0;
                    }
                }
            }
        }
    
    }
    public static int lives(int i,int j,int[][] arr){
        int live=0;
        if(i+1<arr.length && arr[i+1][j]==1){
            live++;
        }
        if(i-1>=0 && arr[i-1][j]==1){
            live++;
        }
        if(j+1<arr[0].length && arr[i][j+1]==1){
            live++;
        }
        if(j-1>=0 && arr[i][j-1]==1){
            live++;
        }
        if(i+1<arr.length && j+1<arr[0].length && arr[i+1][j+1]==1){
            live++;
        }
        if(i+1<arr.length && j-1>=0 && arr[i+1][j-1]==1){
            live++;
        }
        if(i-1>=0 && j-1>=0 && arr[i-1][j-1]==1){
            live++;
        }
        if(i-1>=0 && j+1<arr[0].length && arr[i-1][j+1]==1){
            live++;
        }
        return live;

    }
}