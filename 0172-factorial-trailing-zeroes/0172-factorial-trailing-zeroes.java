class Solution {
    public int trailingZeroes(int n) {
        // int c=0;
        // for(int i=5;i<=n;i*=5){
        //     c+=(n/i);
        // }
        // return c;
        int c=0;
        while(n>=5){
            n/=5;
            c+=n;
        }
        return c;









    //     int ans=fact(n);
    //     int c=0;
    //     if(ans%10==0){
    //         c++;
    //     }
    //     return (c>0) ? c:0;
    // }
    // public int fact(int n){
    //     if(n==1 || n==0){
    //         return 1;
    //     }
    //     int f=fact(n-1);
    //     return f*n;
    }
}