class Solution {
    public int countCompleteDayPairs(int[] arr) {
        int c=0;
    
        for(int i=0;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                if((arr[i]+arr[j])%24==0 && i<j){
                    c++;
                }
                
            }
        }
        return c;
    }
}