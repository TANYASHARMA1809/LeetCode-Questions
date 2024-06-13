class Solution {
    public int minMovesToSeat(int[] seats, int[] arr) {
        int ans=0;
        Arrays.sort(seats);
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<seats.length;i++){
                int val=Math.abs(seats[i]-arr[i]);
                // ans=Math.min(val,ans);
                sum+=val;
            }
            
        
        return sum;
        
    }
}