class Solution {
    public int[][] restoreMatrix(int[] r, int[] c) {
        int n=r.length;
        int m=c.length;
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(r[i]<c[j]){
                    arr[i][j]=r[i];
                }
                else if(r[i]>c[j]){
                    arr[i][j]=c[j];
                }else{
                    arr[i][j]=c[j];
                }
                r[i]-=arr[i][j];
                c[j]-=arr[i][j];
            }
        }
        return arr;
        
    }
}