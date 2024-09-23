class Solution {
    public void moveZeroes(int[] arr) {
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c++;
            }else if(c>0){
                int temp=arr[i];
                arr[i]=0;
                arr[i-c]=temp;
            }
        }
    }
}