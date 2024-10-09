class Solution {
    public int[][] merge(int[][] arr) {
        int n=arr.length;
        List<List<Integer>> ll=new ArrayList<>();
        Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int[]a,int[]b){
                return a[0]-b[0];
            }
        });
        for(int i=0;i<n;i++){
            if(ll.isEmpty() || arr[i][0] > ll.get(ll.size()-1).get(1)){
                ll.add(Arrays.asList(arr[i][0],arr[i][1]));
            }else{
                ll.get(ll.size()-1).set(1,Math.max(ll.get(ll.size()-1).get(1),arr[i][1]));
            }
        }
        int[][] ans=new int[ll.size()][2];
        for(int i=0;i<ll.size();i++){
            ans[i][0]=ll.get(i).get(0);
            ans[i][1]=ll.get(i).get(1);
        }
        return ans;
    }
}