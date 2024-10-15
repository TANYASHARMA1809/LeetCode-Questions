class Solution {
    public String largestOddNumber(String s) {
        for(int i=s.length()-1;i>=0;i--){
            if(i!=0 && s.charAt(i)%2!=0){
                return s.substring(0,i+1);
            }
            if(i==0 && s.charAt(i)%2!=0){
                return s.substring(0,1);
            }
        }
        return "";
    }
}