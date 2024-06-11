class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i])){
                map.put(arr1[i],map.get(arr1[i])+1);
            }else{
                map.put(arr1[i],1);
            }   
        }
        List<Integer> ll=new ArrayList<>();
    
        for(int val:arr2){
             for(int val2:map.keySet()){
                if(val==val2){
                    int c=map.get(val);
                    while(c-- >0){
                        ll.add(val);
                    }
                }
             }
        }
        List<Integer> ll2=new ArrayList<>();
        for(int val:arr2){
            ll2.add(val);
        }     
            for(int num:arr1){
                if(!ll2.contains(num)){
                    ll.add(num);
                  
                }
            }
        int[] ans=new int[ll.size()];
        for(int i=0;i<ll.size();i++ ){
            ans[i]=ll.get(i);
        }
        return ans;

        
    }
}