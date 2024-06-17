class Solution {
    public boolean judgeSquareSum(int c) {
        long b=(int)Math.sqrt(c);
        long a=0;
        while(a<=b){
            long ans=(a*a)+(b*b);
            if(ans==c){
                return true;
            }
            else if(ans<c){
                a++;
            }else{
                b--;
            }
        }
        return false;









        // for(int i=0;i*i<=c;i++){
        //     for(int j=0;j*j<=c;j++){
        //         if((i*i)+(j*j)==c){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
    }
}