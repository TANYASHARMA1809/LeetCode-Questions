class Solution {
    public int kthSmallest(int[][] arr, int k) {
        List<Integer> ll=new ArrayList<>();
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ll.add(arr[i][j]);
            }
        }
        Collections.sort(ll);
        return ll.get(k-1);
        
    }
}