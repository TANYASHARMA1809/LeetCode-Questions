class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        // int c=0;
        // if(arr.length==3){
        //     for(int i=0;i<arr.length;i++){
        //         if(arr[i]%2!=0){
        //             c++;
        //         }
        //     }
        // }
        // if(c==3){
        //     return true;
        // }
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+2]%2!=0){
               return true;
            }
        }
        return false;
       
        
    }
}