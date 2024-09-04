class Solution {
    public String getPermutation(int n, int k) {
         List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        // Create a factorial lookup array
        int[] factorial = new int[n];
        factorial[0] = 1;
        for (int i = 1; i < n; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        
        // Convert k to 0-based index
        k--;
        
        // Build the permutation using a StringBuilder
        StringBuilder result = new StringBuilder();
        
        for (int i = n; i > 0; i--) {
            int index = k / factorial[i - 1];
            result.append(numbers.get(index));
            numbers.remove(index);
            k %= factorial[i - 1];
        }
        
        return result.toString();




        
    //     StringBuilder ques=new StringBuilder();
    //     for(int i=1;i<=n;i++){
    //         ques.append(i);
    //     }
    //     List<String> ll=new ArrayList<>();
    //     permutation(ques.toString(),"",ll);
    //     //Collections.sort(ll);
    //     return ll.get(k-1);
        
    // }
    // public static void permutation(String ques,String ans,List<String> ll){
    //     if(ques.length()==0){
    //         ll.add(ans);
    //         return;
    //     }
    //     for(int i=0;i<ques.length();i++){
    //         char ch=ques.charAt(i);
    //         String ros=ques.substring(0,i)+ques.substring(i+1);
    //         permutation(ros,ans+ch,ll);

    //     }
        
    }
}