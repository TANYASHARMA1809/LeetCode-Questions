class Solution {
    public int[] nextGreaterElement(int[] arr1, int[] arr2) {
        int[] ans=new int[arr1.length];
        Arrays.fill(ans,-1);
        
        for(int i=0;i<arr1.length;i++){
            int c=0;
           for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    c=1;
                }
                if(arr2[j]>arr1[i] && c==1 ){
                    ans[i]=arr2[j];
                    break;
                }     
            
           }
        }
        return ans;
     
    }
}