class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int m) {
        int zero=0;
        int maxSum=0;
        int n=customers.length;
        int sum=0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                zero+=customers[i];
            }
            if(i<m){
                sum+=(grumpy[i]==1 ? customers[i]:0);
            }else{
                sum+=(grumpy[i]==1 ? customers[i]:0)-(grumpy[i-m]==1 ? customers[i-m]:0);
            }
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum+zero;
    }
}