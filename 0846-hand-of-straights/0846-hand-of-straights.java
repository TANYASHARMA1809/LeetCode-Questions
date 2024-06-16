class Solution {
    public boolean isNStraightHand(int[] arr, int k) {
       if(arr.length%k !=0){
        return false;
       }
       PriorityQueue<Integer> pq=new PriorityQueue<>();
       for(int val:arr){
        pq.add(val);
       }
       while(!pq.isEmpty()){
        int small=pq.poll();
        for(int i=1;i<k;i++){
            if(pq.remove(small+i)){
                continue;
            }else{
                return false;
            }
        }

       }
       return true;
        
    }
}