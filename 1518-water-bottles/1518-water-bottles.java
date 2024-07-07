class Solution {
    public int numWaterBottles(int x, int e) {
        int total=x;
        while(x>=e){
            total+=x/e;
            x=(x/e)+(x%e);
        }
        return total;
        
    }
}