class Solution {
    public int minChanges(int n, int k) {
        if(n==k){
            return 0;
        }
        int c=0;
        while(n!=k){
            int a=n&1;
            int b=k&1;
            if(a==1 && b==0){
                c++;
            }
            else if(a==0 && b==1){
                return -1;
            }
            n>>=1;
            k>>=1;
        }
        return c;
        
    }
}