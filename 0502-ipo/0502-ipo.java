class Solution {
    public int findMaximizedCapital(int k, int w, int[] arrP, int[] arrC) {
        int n=arrP.length;
        int[][] ans=new int[n][2];
        int profit=0;
        for(int i=0;i<n;i++){
            ans[i][0]=arrP[i];
            ans[i][1]=arrC[i];
        }
        Arrays.sort(ans,(a,b) -> a[1]-b[1]);
        int i=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        while(k>0){
            while(i<arrC.length && ans[i][1]<=w){
                pq.add(ans[i][0]);
                i++;
            }
            if(pq.isEmpty()){
                break;
            }
            int c=pq.poll();
            w+=c;
            k--;
        }
        return w;
        
    }
}