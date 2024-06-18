class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int sum=0;
        for(int i=0;i<worker.length;i++){
            int max=0;
            for(int j=0;j<difficulty.length;j++){
                if(difficulty[j]<=worker[i]){
                    max=Math.max(profit[j],max);
                }
            }
            sum+=max;
        }
        if(sum<0){
            return 0;
        }
        return sum;
    }
}