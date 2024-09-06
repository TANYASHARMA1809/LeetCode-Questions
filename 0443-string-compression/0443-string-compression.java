class Solution {
    public int compress(char[] chars) {
        int idx=0;
        int i=0;
        while(i<chars.length){
            char curr=chars[i];
            int c=0;
            while(i < chars.length && chars[i] == curr){
                i++;
                c++;
            }
            chars[idx++]=curr;
            if(c>1){
                for(char ch:Integer.toString(c).toCharArray()){
                    chars[idx++]=ch;
                }
            }
        }
        return idx;
    }
}