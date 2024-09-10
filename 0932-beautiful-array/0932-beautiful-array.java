class Solution {
    public int[] beautifulArray(int n) {
        List<Integer> ll=new ArrayList<>();
        ll.add(1);
        while(ll.size()<n){
            List<Integer> temp=new ArrayList<>();
            for(int a :ll ){
                if(2*a-1 <=n){
                    temp.add(2*a-1);
                }
            }
            for(int a :ll ){
                if(2*a <=n){
                    temp.add(2*a);
                }
            }
            ll=temp;
        }
        int[] ans=new int[ll.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=ll.get(i);
        }
        return ans;
        
    }
}