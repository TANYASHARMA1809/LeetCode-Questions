class Solution {
    public int maximalRectangle(char[][] matrix) {
       int[][] arr=new int[matrix.length][matrix[0].length];
       int ans=0;
       
       for(int i=arr.length-1;i>=0;i--){
        for(int j=0;j<arr[0].length;j++){
            if(i==arr.length-1){
                arr[i][j]=matrix[i][j]=='1' ? 1: 0;
            }else{
                arr[i][j]=matrix[i][j]=='1' ? arr[i+1][j]+1:0;
            }

        }
        ans=Math.max(ans,Area(arr[i]));
       }
       return ans;
    }
          public static int Area(int [] arr){
        int ans=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]<arr[st.peek()]){
                int h=arr[st.pop()];
                int r=i;
                if(st.isEmpty()){
                    int a=h*r;
                    ans=Math.max(ans,a);
                }else{
                    int l=st.peek();
                    int a=h*(r-l-1);
                    ans=Math.max(ans,a);
                }
            }
            st.push(i);
        }
        int r=arr.length;
        while(!st.isEmpty()){
            int h=arr[st.pop()];
            if(st.isEmpty()){
                int a=h*r;
                ans=Math.max(ans,a);
            }else{
                int l=st.peek();
                int a=h*(r-l-1);
                ans=Math.max(ans,a);
            }
        }
        return ans;
    }
      
}