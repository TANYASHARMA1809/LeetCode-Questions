class Solution {
    public boolean validPalindrome(String s) {
       int i=0;
       int j=s.length()-1;
       while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
            if(helper(s,i+1,j)){
                return true;
            }
            if(helper(s,i,j-1)){
                return true;
            }
            return false;
        }
        
        i++;
        j--;
       }
       return true;
    }
    private boolean helper(String str,int s,int e){
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
}