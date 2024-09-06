class Solution {
    public int[] decompressRLElist(int[] arr) {
       List<Integer> ll=new ArrayList<>();
       for(int i=0;i<arr.length-1;i+=2){
        int f=arr[i];
        int val=arr[i+1];
        while(f!=0){
            ll.add(val);
            f--;
        }
       }
       int[] ans=new int[ll.size()];
       for (int i = 0; i < ll.size(); i++) {
            ans[i] = ll.get(i);  
        }
        return ans;
       
    }
}