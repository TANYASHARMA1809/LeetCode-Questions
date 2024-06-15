class Solution {
    public List<String> commonChars(String[] arr) {
        List<String> ans=new ArrayList<>();
        for(char i='a';i<='z';i++){
            int mini=Integer.MAX_VALUE;
            for(String w:arr){
                int c=0;
                for(char ch:w.toCharArray()){
                    if(ch==i){
                        c++;
                    }
                }
                mini=Math.min(mini,c);
                if(mini==0){
                    break;
                }
            }
            for(int idx=0;idx<mini;idx++){
                ans.add(String.valueOf(i));
            }

        }
        return ans;
    }
}