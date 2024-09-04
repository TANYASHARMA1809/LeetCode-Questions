class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> ll=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        subset(nums,0,ll,ans);
        return ans;
        
    }
    public static void subset(int []arr,int idx,List<Integer>ll,List<List<Integer>> ans){
        
        ans.add(new ArrayList<>(ll));
        
        for(int i=idx;i<arr.length;i++){
            if(idx!=i && arr[i]==arr[i-1] ){
                continue;
            }
        
            ll.add(arr[i]);
            subset(arr,i+1,ll,ans);
            ll.remove(ll.size()-1);
            }
    }
}