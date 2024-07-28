class Solution {
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return RobberDP(nums,0,dp);
        
    }
    public static int RobberDP(int[] nums,int i,int[] dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob=nums[i]+RobberDP(nums,i+2,dp);
        int dont=RobberDP(nums,i+1,dp);
        dp[i]=Math.max(rob,dont);
        return Math.max(rob,dont);

    }












    // public static int RobberDP(int[] arr,int i,int[]dp){
    //     //top down
    //     if(i>=arr.length){
    //         return 0;
    //     }
    //     if(dp[i]!=-1){//for this case when dp[i]!=0 check constraint of question,array ke andr 0 ki value hui toh yh same format chal nhi payega
    //         return dp[i];
    //     }
    //     int rob= arr[i]+RobberDP(arr,i+2,dp);//ith ghr lootnge tb addition i+2 se shru krnge
    //     int DontRob=RobberDP(arr,i+1,dp);//ith ghr nhi loota toh agla ght i+1 ka hoga
    //     dp[i]=Math.max(rob,DontRob);//yaad kia h
    //     return Math.max(rob,DontRob);

    // }
}