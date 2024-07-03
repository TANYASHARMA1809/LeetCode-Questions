class Solution {
    public int minDifference(int[] arr) {
        Arrays.sort(arr);
        if(arr.length<=4){
            return 0;
        }
        int ans=arr[arr.length-1]-arr[0];
        for(int i=0;i<=3;i++){
            ans=Math.min(ans,arr[arr.length-(3-i)-1]-arr[i]);
        }
        return ans;
        
    }
}