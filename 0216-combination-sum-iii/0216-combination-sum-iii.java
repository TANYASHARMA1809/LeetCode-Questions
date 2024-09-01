class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        boolean[] board=new boolean[9];
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        solve(board,k,0,0,ll,ans,0,n);
        return ans;
        
    }
    public static void solve(boolean[] board,int tq,int qpsf,int idx,List<Integer>ll,List<List<Integer>> ans,int sum,int n){
        if(tq==qpsf){
            if(sum==n){
                ans.add(new ArrayList<>(ll));
                return;
            }
        }

        for(int i=idx;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                ll.add(i+1);
                solve(board,tq,qpsf+1,i+1,ll,ans,sum+i+1,n);
                ll.remove(ll.size()-1);
                board[i]=false;
            }
        }
    }
}