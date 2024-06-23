class Solution {
    public int longestSubarray(int[] arr, int limit) {
        int s=0;
        int e=0;
        int ans=0;
        PriorityQueue<Integer> mini=new PriorityQueue<>();
        PriorityQueue<Integer> maxi=new PriorityQueue<>(Collections.reverseOrder());
        while(e<arr.length){
            mini.add(arr[e]);
            maxi.add(arr[e]);
            while(maxi.peek()-mini.peek() > limit){
                mini.remove(arr[s]);
                maxi.remove(arr[s]);
                s++;
            }
            ans=Math.max(ans,e-s+1);
            e++;
        }
        return ans;
    }
}