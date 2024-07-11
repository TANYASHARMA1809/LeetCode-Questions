class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        return helper(nums);    
    }

    private static int helper(int[] arr){
        int linear=kadane(arr);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr[i]*=-1;
        }
        int invert=kadane(arr);
        int circular=invert+sum;
        if(circular==0){
            return linear;
        }
        return Math.max(linear,circular);

    }
    private static int kadane(int[] arr){
        int ans=Integer.MIN_VALUE;
        int prev=0;
        for(int i=0;i<arr.length;i++){
            prev+=arr[i];
            ans=Math.max(ans,prev);
            if(prev<0){
                prev=0;
            }
            
        }
        return ans;
    }

































    // public static int MaximumSum(int[] arr){
    //     int linear_kadane=Kadane(arr);
    //     int sum=0;
    //     for (int i = 0; i < arr.length; i++) { 
    //         sum+=arr[i];
    //         arr[i]=arr[i]*-1;
    //     }
    //     int Inverted_kadane=Kadane(arr);
    //     int circle_kadane=Inverted_kadane+sum;
    //     if(circle_kadane==0){
    //         return linear_kadane;
    //     }
        
    //     return Math.max(linear_kadane,circle_kadane);
    // }
    // public static int Kadane(int [] arr){
    //     int ans=Integer.MIN_VALUE;
    //     int prevsum=0;
    //     for(int i=0;i<arr.length;i++){
    //         prevsum+=arr[i];
    //         ans=Math.max(ans,prevsum);

    //         if(prevsum<0){
    //             prevsum=0;
    //         }
    //     }
    //     return ans;
    // }
    
}