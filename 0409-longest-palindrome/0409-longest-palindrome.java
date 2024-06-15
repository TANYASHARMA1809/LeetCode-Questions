class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        int c=0;
        boolean flag=true;
        for(Character key:map.keySet()){
            if(map.get(key)%2 != 0){
                c++;
                flag=false;
            }
            
        }
        return (flag) ? s.length() : s.length()-c+1;
        
    }
}