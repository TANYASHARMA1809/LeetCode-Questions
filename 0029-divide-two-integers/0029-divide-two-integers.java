class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor){
            return 1;
        }
        boolean sign=true;
        if(dividend<=0 && divisor >0){
            sign=false;
        }
        if(dividend >=0 && divisor<0){
            sign=false;
        }
        long n=Math.abs((long)dividend);
        long d=Math.abs((long)divisor);
        int ans=0;
        while(n>=d){
            int c=0;
            while(n>=(d<<(c+1))){ // d * 2^c+1
                c++;
            }
            ans+=(1<<c);
            n=n-(d<<c); 
        }
        if(ans == (1<<31) && sign==true){
            return Integer.MAX_VALUE;
        }
        if(ans == (1<<31) && sign==false){
            return Integer.MIN_VALUE;
        }

        return sign ? ans:-ans;
        
        
    }
}