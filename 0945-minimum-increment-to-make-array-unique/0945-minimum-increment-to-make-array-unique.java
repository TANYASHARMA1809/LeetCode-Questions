class Solution {
    public int minIncrementForUnique(int[] arr) {
        Arrays.sort(arr);
        int c=0;
        int prev=-1;
        for(int i=0;i<arr.length;i++){
            if(prev>=arr[i]){
                c+=(prev-arr[i]+1);
                arr[i]=prev+1;
            }
           prev=arr[i];
        }
         
        return c;
    }
}